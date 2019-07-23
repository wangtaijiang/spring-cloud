/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/22    11:38
 *
 * 一、 通道（Channel）：用于源节点与目标节点的连接。在JAVA NIO中负责缓冲区中数据的传输、
 *      Channel本身不存储数据，因为需要配合缓冲区进行传输。
 * 二、通道的主要实现类
 *  java.nio.channels.Channel   接口：
 *      \--FileChannel
 *      \--SocketChannel
 *      \--ServerSockerChannel
 *      \--DatagramChannel
 *
 * 三、获取通道
 * 1.   java针对支持通道的类提供了getChannel()方法
 *      本地IO：
 *      FileInputStream/FileOutputStream
 *      RandomAccessFile
 *
 *      网络IO:
 *      Socket
 *      ServerSocket
 *      DatagramSocket
 *
 * 2.   在JDK1.7中的NIO.2 针对各个通道提供了静态方法 open()
 * 3.   在JDK1.7中NIO.2 的Files 工具类的newByteChannel()
 *
 * 四、 通道之间的数据传输
 * transferFrom()
 * transferTo()
 *
 * 五、分散（Scatter）与聚集（Gather）
 * 分散读取（Scattering Reads）：将通道中的数据分散到多个缓冲区中（注意：按照缓冲区的顺序，从Channel中读取的数据依次将Buffer填满）
 * 聚集写入（Gathering Writes）：将多个缓冲区中的数据聚集到通道中
 *
 * 六、字符集：Charset
 * 编码：字符串->字节数组
 * 解码：字节数组->字符串
 */
public class TestChannel {

    // 利用通道完成文件的复制（非直接缓冲区）
    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel fisChannel = null;
        FileChannel fosChannel = null;

        try {

            fis = new FileInputStream("D:\\myGitCode\\spring-cloud\\client-service\\src\\test\\resources\\20103.xls");
            fos = new FileOutputStream("D:\\myGitCode\\spring-cloud\\client-service\\src\\test\\resources\\20103t1.xls");
            //1)获取通道
            fisChannel = fis.getChannel();
            fosChannel = fos.getChannel();

            //2)分配指定大小缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            //3)将通道中的数据存入缓冲区中
            while (fisChannel.read(buffer) != -1){
                buffer.flip();// 切换到读数据模式
                // 4)将缓冲区中的数据写入通道
                fosChannel.write(buffer);
                buffer.clear();//清空缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fosChannel != null){
                try {
                    fosChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fisChannel != null){
                try {
                    fisChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    // 直接缓冲区完成文件的复制（内存映射文件）
    @Test
    public void test2() throws IOException {
        long start = System.currentTimeMillis();
        FileChannel inChannel = FileChannel.open(Paths.get("D:\\myGitCode\\spring-cloud\\client-service\\src\\test"
                + "\\resources\\20103.xls"), StandardOpenOption.READ,StandardOpenOption.WRITE);
        FileChannel outChannel = FileChannel.open(Paths.get("D:\\myGitCode\\spring-cloud\\client-service\\src\\test"
                + "\\resources\\20103t1.xls"), StandardOpenOption.WRITE,
//                StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);
                StandardOpenOption.READ,StandardOpenOption.CREATE);

        MappedByteBuffer inBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        // 直接读I缓冲区进行数据读写操作
        byte[] bytes = new byte[inBuffer.limit()];
        inBuffer.get(bytes);
        outBuffer.put(bytes);

        inChannel.close();
        outChannel.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //通道之间的数据传输(直接缓冲区)
    @Test
    public void test3() throws IOException {
        FileChannel inChannel = FileChannel.open(Paths.get("D:\\myGitCode\\spring-cloud\\client-service\\src\\test"
                + "\\resources\\20103.xls"), StandardOpenOption.READ,StandardOpenOption.WRITE);
        FileChannel outChannel = FileChannel.open(Paths.get("D:\\myGitCode\\spring-cloud\\client-service\\src\\test"
                        + "\\resources\\20103t1.xls"), StandardOpenOption.WRITE,
                //                StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);
                StandardOpenOption.READ,StandardOpenOption.CREATE);

//        inChannel.transferTo(0,inChannel.size(),outChannel);

        outChannel.transferFrom(inChannel,0,inChannel.size());
        outChannel.close();
        inChannel.close();
    }

    //分散和聚集
    @Test
    public void test4() throws IOException{
        RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\myGitCode\\spring-cloud\\client-service\\src"
                + "\\test\\resources\\20103.xls","rw");

        //1.获取通道
        FileChannel channel = randomAccessFile.getChannel();

        //2.分配指定大小的缓冲区
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(100);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1024);

        //3.分散读取
        ByteBuffer[] byteBuffers = {byteBuffer1,byteBuffer2};
        channel.read(byteBuffers);

        for (ByteBuffer byteBuffer : byteBuffers) {
            byteBuffer.flip();
        }

        System.out.println(new String(byteBuffer1.array(),0,byteBuffer1.limit()));
        System.out.println("-=-============-=-=-==-=");
        System.out.println(new String(byteBuffer2.array(),0,byteBuffer2.limit()));

        //4.聚集写入
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("D:\\myGitCode\\spring-cloud\\client-service\\src"
                + "\\test\\resources\\20103qq.xls", "rw");
        FileChannel channel1 = randomAccessFile1.getChannel();
        channel1.write(byteBuffers);

    }

    //字符集
    @Test
    public void test5() throws IOException{
        SortedMap<String, Charset> map = Charset.availableCharsets();
        Set<Map.Entry<String, Charset>> set = map.entrySet();
        for (Map.Entry<String, Charset> entry : set) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
    //字符集
    @Test
    public void test6() throws IOException{
        Charset gbk = Charset.forName("GBK");

        //获取编码器
        CharsetEncoder charsetEncoder = gbk.newEncoder();

        //获取解码器
        CharsetDecoder charsetDecoder = gbk.newDecoder();

        CharBuffer charBuffer = CharBuffer.allocate(1024);
        charBuffer.put("hello world! 你好 北京");
        charBuffer.flip();

        //编码
//        ByteBuffer byteBuffer = charsetEncoder.encode(charBuffer);
        ByteBuffer byteBuffer = gbk.encode(charBuffer);
        System.out.println(byteBuffer);
//        for (int i = 0; i < byteBuffer.limit(); i++) {
//            System.out.println(byteBuffer.get());
//        }

        //解码
//        byteBuffer.flip();// 转换模式
//        CharBuffer charBuffer1 = charsetDecoder.decode(byteBuffer);
        CharBuffer charBuffer1 = gbk.decode(byteBuffer);
        System.out.println(charBuffer1);

        System.out.println("=========================");

        // 换一种解码方式
        byteBuffer.flip();
        Charset utf8 = Charset.forName("UTF-8");
        CharBuffer charBuffer2 = utf8.decode(byteBuffer);
        System.out.println(charBuffer2);

        System.out.println("=========================");
        ByteBuffer encode = utf8.encode(charBuffer2);
        System.out.println(encode);
//        for (int i = 0; i < encode.limit(); i++) {
//            System.out.println(encode.get());
//        }

//        encode.flip();
        CharBuffer decode = gbk.decode(encode);

        System.out.println(decode);
    }
}

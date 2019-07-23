/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/22    17:39
 */
public class TestBlockingNIO2 {

    //客户端
    @Test
    public void client() throws IOException {
        //1.获取通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));

        FileChannel fileChannel = FileChannel.open(Paths.get("D:\\myGitCode\\spring-cloud\\client-service\\src\\test"
                + "\\resources\\20103.xls"), StandardOpenOption.READ);

        //2.分配指定大小的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //3.读取本地文件，并发送到服务器
        while (fileChannel.read(buffer) != -1){
            buffer.flip();
            socketChannel.write(buffer);
            buffer.clear();
        }

        socketChannel.shutdownOutput();// 1.在blocking模式下，不shutdown服务端会一直等待输入    2.第二种方法：使用non blocking模式
        //5.接收反馈
        int len = 0;
        while ((len = socketChannel.read(buffer)) != -1){
            buffer.flip();
            System.out.println(new String(buffer.array(),0,len));
            buffer.clear();
        }

        //4.关闭通道
        socketChannel.close();
        fileChannel.close();


    }

    //服务端
    @Test
    public void server() throws IOException {
        //1.获取通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        FileChannel fileChannel =
                FileChannel.open(Paths.get("D:\\test.xls"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        //2.绑定链接
        serverSocketChannel.bind(new InetSocketAddress(9999));

        //3.获取客户端连接的通道
        SocketChannel socketChannel = serverSocketChannel.accept();

        //4.分配指定大小缓冲区
        ByteBuffer b = ByteBuffer.allocate(1024);

        //5.接受客户端的数据
        while (socketChannel.read(b) != -1){
            b.flip();
            fileChannel.write(b);
            b.clear();
        }
        //6.发送反馈
        b.put("服务端接收数据成功！".getBytes());
        b.flip();
        socketChannel.write(b);
        //6.关闭资源
        fileChannel.close();
        socketChannel.close();
        serverSocketChannel.close();

    }
}

/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/22    17:13
 *
 * 一、使用NIO完成网络通信的三个核心
 *
 * 1、通道（Channel）：负责连接
 *
 *      java.nio.channels.Channel   接口：
 *          \--SelectableChannel
 *              \--SocketChannel
 *              \--ServerSocketChannel
 *              \--DatagramChannel
 *
 *              \--Pipe.SinkChannel
 *              \--Pipe.SourceChannel
 * 2、缓冲区（Buffer）：负责数据的存取
 *
 * 3、选择器（Selector）：是SelectableChannel的多路复用器。用于监控electableChannel的IO状况
 */
public class TestNonBlockingNIO {
    @Test
    public void client() throws IOException {
        //1.获取通道
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));

        //2.切换成非阻塞模式
        socketChannel.configureBlocking(false);

        //3.分配指定大小缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //4.发送数据给客户端
        byteBuffer.put(new Date(System.currentTimeMillis()).toString().getBytes());
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
        byteBuffer.clear();

        socketChannel.close();

    }

    @Test
    public void server() throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        serverSocketChannel.configureBlocking(false);

        serverSocketChannel.bind(new InetSocketAddress(9999));

        //获取选择器
        Selector selector = Selector.open();

        //将通道注册到选择器上
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        //通过选择器，轮询式的获取选择器上已经准备就绪的事件
        while (selector.select() > 0){
            Iterator<SelectionKey> it = selector.selectedKeys().iterator();
            //获取当前选择器中所有注册的“选择键（已就绪的监听事件）”
            while (it.hasNext()){
                //获取准备就绪的事件
                SelectionKey sk = it.next();

                //判断准备就绪的事件类型
                if(sk.isAcceptable()){
                    //若接收就绪，获取客户端连接
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    //切换为非阻塞模式
                    socketChannel.configureBlocking(false);
                    //注册socketChannel到selector
                    socketChannel.register(selector,SelectionKey.OP_READ);

                }else if(sk.isReadable()){
                    //获取选择器上读就绪的通道
                    SocketChannel socketChannel = (SocketChannel)sk.channel();
                    //读取数据
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    int len = 0;
                    if((len = socketChannel.read(byteBuffer)) != -1){
                        byteBuffer.flip();
                        System.out.println(new String(byteBuffer.array(),0,len));
                        byteBuffer.clear();
                    }

                }
                //取消选择键（SelectKey）
                it.remove();
            }
        }

    }
}

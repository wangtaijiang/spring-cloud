/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/22    20:56
 */
public class TestPipe {
    @Test
    public void test1() throws IOException {
        //获取管道
        Pipe pipe = Pipe.open();

        //将数据写入管道
        Pipe.SinkChannel sinkChannel = pipe.sink();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("通过单向管道（Pipe）发送数据 ".getBytes());
        byteBuffer.flip();
        sinkChannel.write(byteBuffer);


        // 从管道中读取数据
        Pipe.SourceChannel sourceChannel = pipe.source();
//        byteBuffer.flip();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int len = sourceChannel.read(buffer);
        System.out.println(new String(buffer.array(),0,len));
        sourceChannel.close();
        sinkChannel.close();

    }
}

/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.oom;

import java.nio.ByteBuffer;

/**
 * @authur wtj
 * @date 2019/7/1    11:09
 *
 * 配置参数：
 * -Xms
 */
public class DirectBufferMemoryDemo {
    public static void main(String[] args) {

        System.out.println("配置的maxDirectMemory:" +
                (sun.misc.VM.maxDirectMemory()/(double)1024/1024) + "MB");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        // -XX:MaxDirectMemorySize=5m   配置为5m，实际用6m。看结果
        ByteBuffer bb = ByteBuffer.allocateDirect(6*1024*1024);
        /**
         * Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
         */
    }
}

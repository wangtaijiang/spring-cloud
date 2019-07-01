/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.oom;

/**
 * @authur wtj
 * @date 2019/7/1    10:22
 */
public class JavaHeapSpaceDemo {
    public static void main(String[] args) {
        // 例子1
//         String str = "myString";
//
//         while (true){
//             str += str + new Random().nextInt(11111111) + new Random().nextInt(22222);
//             str.intern();
//         }

         // 例子2
        byte[] bytes = new byte[80 * 1024 * 1024];
        /**
         * 结果：
         * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
         */
    }
}

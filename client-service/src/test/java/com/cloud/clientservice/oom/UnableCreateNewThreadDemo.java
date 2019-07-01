/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.oom;

/**
 * @authur wtj
 * @date 2019/7/1    11:46
 *
 * 部署到linux系统上
 */
public class UnableCreateNewThreadDemo {

    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println("===============     i = "+ i);
            new Thread(() -> {

            },""+i).start();

        }
    }
}

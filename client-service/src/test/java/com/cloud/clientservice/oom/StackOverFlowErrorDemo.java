/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.oom;

/**
 * @authur wtj
 * @date 2019/7/1    10:11
 */
public class StackOverFlowErrorDemo {

    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError() {
        stackOverflowError();
        /**
         * at com.cloud.clientservice.oom.StackOverFlowErrorDemo.stackOverflowError(StackOverFlowErrorDemo.java:17)
         */
    }
}

/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.cas;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/6/25    14:28
 *
 * 1. CAS是什么？ ===>compareAndSet
 *    比较并交换
 *
 *
 *
 */
public class CASDemo {

    @Test
    public void test(){
        AtomicInteger atomicInteger = new AtomicInteger((5));

        // main do thing......
        System.out.println(atomicInteger.compareAndSet(5, 2019)+"\t current data :" + atomicInteger.get());

        System.out.println(atomicInteger.compareAndSet(5, 1024)+"\t current data :" + atomicInteger.get());

        atomicInteger.getAndIncrement();
    }
}

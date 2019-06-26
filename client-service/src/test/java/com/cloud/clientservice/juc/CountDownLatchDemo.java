/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.juc;

import java.util.concurrent.CountDownLatch;

import com.cloud.pojo.enums.CountryEnum;

/**
 * @authur wtj
 * @date 2019/6/26    14:02
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws Exception {

        countDownLatcase1();
        countDownLatcase2();

    }

    // 如何设置异步线程的执行顺序
    public static void countDownLatcase2() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {

            int finalI = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "\t " +CountryEnum.forEachCountryEnum(finalI).getMessage()+"灭亡。。");
                countDownLatch.countDown();
            }, CountryEnum.forEachCountryEnum(i).getMessage()).start();
        }
        countDownLatch.await();


        System.out.println(Thread.currentThread().getName() + "\t 秦国统一六国。。");
        // 枚举类用法
        System.out.println();
        System.out.println(CountryEnum.ONE);
        System.out.println(CountryEnum.ONE.getCode());
        System.out.println(CountryEnum.ONE.getMessage());

    }

    // 主线程等待其他线程执行完成后再执行
    public static void countDownLatcase1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "\t 异步线程结束。。");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + "\t main线程结束。。");

    }
}

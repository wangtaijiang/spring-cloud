/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @authur wtj
 * @date 2019/6/27    16:01
 *
 * 第4种获得/使用java多线程的方式，线程池
 */
public class MyThreadPoolDemo {
    public static void main(String[] args) {


//        testJDKThreadPool();
        testMyThreadPool();
    }
    static void testMyThreadPool(){
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.DiscardPolicy());// 会丢任务
//                new ThreadPoolExecutor.DiscardOldestPolicy());
                new ThreadPoolExecutor.CallerRunsPolicy()); // 回退策略:谁给的任务谁办 main办
//                new ThreadPoolExecutor.AbortPolicy()); // 默认拒绝策略

        try{
//            for (int i = 0; i < 5; i++) {
//            for (int i = 0; i < 8; i++) {
            for (int i = 0; i < 10; i++) { // 由此可见默认拒绝策略生产上不可用
                threadPool.execute(() ->{
                    System.out.println(Thread.currentThread().getName() + " \t 办理业务");
                });
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }
    static void testJDKThreadPool(){
        // 查看CPU核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        // Array    Arrays
        // Collection   Collections
        // Executor Executors

//        ExecutorService threadPool = Executors.newFixedThreadPool(5); // 一池5个线程
//        ExecutorService threadPool = Executors.newSingleThreadExecutor(); // 一池1个线程
        ExecutorService threadPool = Executors.newCachedThreadPool(); // 一池1个线程
        // 模拟10个用户办理业务，每个用户就是一个来自外部的请求线程
        try{
            for (int i = 0; i < 10; i++) {
                threadPool.execute(() ->{
                    System.out.println(Thread.currentThread().getName() + " \t 办理业务");
                });
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }
}

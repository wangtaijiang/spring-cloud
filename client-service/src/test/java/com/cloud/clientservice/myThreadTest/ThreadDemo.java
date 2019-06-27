/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.myThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @authur wtj
 * @date 2019/6/14    10:26
 *
 * 开启线程的3种基本方式
 * 主要看Callable的使用
 */
class MyThread2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "\t come in callable...");
        return 1024;
    }
}
class MyThread1 implements Runnable{

    @Override
    public void run() {

    }
}

 class MyThread  extends Thread   {
    @Override
    public void run() {
    }
}

public class ThreadDemo{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        testStartThread();
        testCallable();

    }

    // 开启线程的3种基本方法
    static void testStartThread(){
        Thread t1 = new Thread();
        Thread t2 = new Thread(new MyThread()); // public Thread(Runnable target) 源码
        Thread t21 = new Thread(new MyThread(),"threadNmae");
        Thread t3 = new Thread(new MyThread1());
        //Thread t4 = new Thread(new Thread(2));
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());
    }

    // 举例 多线程计算
    static void testCallable() throws ExecutionException, InterruptedException {

        // 2个线程，一个main线程，一个callable线程

        //FutureTask(Callable<V> callable)
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());
        FutureTask<Integer> futureTask2 = new FutureTask<>(new MyThread2());

        Thread t4 = new Thread(futureTask,"callable");
        Thread t5 = new Thread(futureTask,"callable2");// 第2次 用futrueTask就不再进入MyThread2的run（）方法
        Thread t6 = new Thread(futureTask2,"callable3"); // 要进入MyThread2的run（）方法，必须新new一个FutrueTask

        t4.start();
        t5.start();
        t6.start();


        int result1 = 100;
//        int result2 = futureTask.get();
//        while (!futureTask.isDone()){ //类比自旋锁
//            // futrueTask结束后再get
//        }
        int result2 = futureTask.get(); // futureTask.get()要求获得callable线程的结果，如果没有计算完成，就会阻塞，直到拿到结果为止；所以建议将此步放在后面
        int result3 = futureTask.get();
        int result4 = futureTask.get();
        System.out.println("******  result = " + (result1 + result2 + result3 + result4));
    }
}

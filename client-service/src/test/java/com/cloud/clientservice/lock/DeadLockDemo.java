/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lock;

import java.util.concurrent.TimeUnit;

/**
 * @authur wtj
 * @date 2019/6/28    9:57
 *
 * 死锁是指两个或两个以上的进程在执行过程中，
 * 因争夺资源而造成的一种互相等待的现象，
 * 若无外力干涉那他们都将无法进行下去
 */
public class DeadLockDemo {
    public static void main(String[] args) {

        String lockA = "lockA";
        String lockB = "lockB";

        new Thread(new HoldLockThread(lockA,lockB),"aaa").start();
        new Thread(new HoldLockThread(lockB,lockA),"bbb").start();

        /**
         * linux    ps =ef|grep xxxx    ls -l
         * window下运行程序  也有类似的ps的查看进程的命令，但目前我们只看java
         *      jps = java ps   jps -l
         */
    }
}

// 资源类
class HoldLockThread implements Runnable{

    private String lockA;
    private String lockB;

    public HoldLockThread(String lockA,String lockB){
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {

        synchronized(lockA){
            System.out.println(Thread.currentThread().getName() + "\t 持有 "+ lockA );
            System.out.println(Thread.currentThread().getName() + "\t 尝试获取 "+ lockB );
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(lockB){
                System.out.println(Thread.currentThread().getName() + "\t 持有 "+ lockB );
                System.out.println(Thread.currentThread().getName() + "\t 尝试获取 "+ lockA );
            }
        }
    }
}
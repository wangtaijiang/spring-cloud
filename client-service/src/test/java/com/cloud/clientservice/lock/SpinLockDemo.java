/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @authur wtj
 * @date 2019/6/26    11:08
 *
 * 实现一个自旋锁
 * 自旋锁好处：循环比较获取直到获取到成功为止，没有类似wait的阻塞
 *
 * 通过CAS操作完成自旋锁，A线程先进来调用mylock方法自己持有锁5秒钟，
 * B进来发现有其他线程持有锁，不是null，所以只能通过自旋等待，直到A释放后B获得
 *
 */
public class SpinLockDemo {

    //原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void mylock(){

        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + "\t come in...");
        while(!atomicReference.compareAndSet(null,thread)){

        }
    }

    public void myUnlock() {

        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + "\t invoke myUnLock method");

    }
    public static void main(String[] args){

        SpinLockDemo spinLockDemo = new SpinLockDemo();

        new Thread(() ->{
            spinLockDemo.mylock();
            // 暂停一会线程
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        },"A").start();

        // 暂停一会线程,保证A线程先启动
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() ->{
            spinLockDemo.mylock();
            spinLockDemo.myUnlock();
        },"B").start();
    }
}

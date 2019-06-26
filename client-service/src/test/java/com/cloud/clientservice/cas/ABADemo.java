/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @authur wtj
 * @date 2019/6/25    16:41
 */
public class ABADemo { //   AtomicstampedReference

    static AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
    static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100,1);


   public static void main(String[] args){
       System.out.println("=======以下是ABA问题的产生======");
        new Thread(() -> {
            atomicReference.compareAndSet(100,101);
            atomicReference.compareAndSet(101,100);
        },"t1").start();

        new Thread(() -> {
            // 暂停1秒钟t2线程，保证t1完成一次ABA操作
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atomicReference.compareAndSet(100, 2019) + "\t " + atomicReference.get());
        },"t2").start();

       System.out.println("=======以下是ABA问题的解决======");

       new Thread(() -> {
           int stamp = atomicStampedReference.getStamp();
           System.out.println(Thread.currentThread().getName() + "\t 第一次版本号：" + stamp);
           // 暂停1秒钟t3线程，保证t1完成一次ABA操作
           try {
               TimeUnit.SECONDS.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           atomicStampedReference.compareAndSet(100,101,atomicStampedReference.getStamp(),
                   atomicStampedReference.getStamp() + 1);
           System.out.println(Thread.currentThread().getName() + "\t 第二次版本号：" + atomicStampedReference.getStamp());

           atomicStampedReference.compareAndSet(101,100,atomicStampedReference.getStamp(),
                   atomicStampedReference.getStamp() + 1);
           System.out.println(Thread.currentThread().getName() + "\t 第三次版本号：" + atomicStampedReference.getStamp());
       },"t3").start();

       new Thread(() -> {
           int stamp = atomicStampedReference.getStamp();
           System.out.println(Thread.currentThread().getName() + "\t 第一次版本号：" + stamp);
           // 暂停3秒钟t4线程，保证t1完成一次ABA操作
           try {
               TimeUnit.SECONDS.sleep(3);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           boolean result = atomicStampedReference.compareAndSet(100,2019,stamp,
                   stamp + 1);
           System.out.println(Thread.currentThread().getName() + "\t 修改成功否" + result + "\t 当前版本号： " + atomicStampedReference.getStamp());
           System.out.println(Thread.currentThread().getName() + "\t 当前值为" + atomicStampedReference.getReference());
       },"t4").start();
    }
}

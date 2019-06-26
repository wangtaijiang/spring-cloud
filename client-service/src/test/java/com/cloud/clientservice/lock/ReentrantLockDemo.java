/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 资源类
class Phone implements Runnable{

    // 同步方法1
    public synchronized void sendSMS()throws Exception{
        System.out.println(Thread.currentThread().getName() + "\t invoke sendSMS method");
        sendEmail();
    }

    // 同步方法2
    public synchronized void sendEmail()throws Exception{
        System.out.println(Thread.currentThread().getName() + "\t invoke sendEmail method");
    }
    //======================================================
    Lock lock = new ReentrantLock();//默认为 new ReentrantLock(false);

    @Override
    public void run() {
        get();
    }

    private void set() {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "\t invoke set method" );

        }finally {
            lock.unlock();
        }
    }

    private void get() {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "\t invoke get method" );
            set();
        }finally {
            lock.unlock();
        }

    }

}
/**
 * @authur wtj
 * @date 2019/6/26    10:17
 *
 * 可重入锁（也叫递归锁）
 *
 * 指的是同一线程外层函数获得锁后，内层递归函数仍然能获取该锁的代码
 * 在同一个线程外层方法获取锁的时候，在进入内层方法会自动获取锁
 *
 * 也即是说，线程可以进入任何一个他已经拥有的锁所同步着的代码块
 */
public class ReentrantLockDemo {

    public static void main(String[] args) {
        testSychronized();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("====================================");
        testReentrantLock();
    }

    // ReentrantLock 是可重入锁
    private static void testReentrantLock() {
        Phone phone = new Phone();
        Thread t3 = new Thread(phone,"t3");
        Thread t4 = new Thread(phone);
        t3.start();
        t4.start();
    }

    // synchronized 是可重入锁
    public static void testSychronized(){
        Phone phone = new Phone();

        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t1").start();

        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t2").start();

        /**
         * result:
         * t1	 invoke sendSMS method
         * t1	 invoke sendEmail method
         * t2	 invoke sendSMS method
         * t2	 invoke sendEmail method
         */
    }



}

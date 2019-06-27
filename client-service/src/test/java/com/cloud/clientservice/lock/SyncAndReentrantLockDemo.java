/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @authur wtj
 * @date 2019/6/27    9:56
 *
 * Synchronized与Lock有什么区别？
 * 1.原始构成
 * Synchronized是关键字属于JVM层面
 * monitorenter（底层是通过monitor对象来完成，其实wait、notify等方法也依赖于monitor对象只有在同步块或者方法中才能调wait、notify等方法
 * monitorexit
 * Lock是具体类（java.util.concurrent.locks.Lock）是api层面的锁
 * 2.使用方法
 * synchronized不需要用户去手动释放锁，当synchronized代码块执行完后系统会自动让县城释放对锁的占用
 * ReentrantLock则需要用户去手动释放锁，若没有主动释放锁，就有可能导致出现死锁现象。
 * 需要Lock（）和unlock（）方法配合try/finally语句块来完成。
 * 3.等待是否可中断
 * synchronized不可中断，除非抛出异常或者正常运行完成
 * ReentrantLock 可中断
 * 1）设置超市方法tryLock(long timeout, TimeUnit unit)
 * 2）lockInterruptibly()放代码块中，调用interrupt()方法可中断
 * 4.加锁是否公平
 * synchronized 是非公平锁
 * ReentrantLock两者都可以，默认非公平锁，构造方法可以传入boolean值，true为公平锁，false为非公平锁
 * 5.锁绑定多个条件Condition
 * synchronized没有
 * ReentrantLock用来实现分组唤醒需要唤醒的线程们，可以精确唤醒，而不是像synchronized要么随机唤醒一个线程，要么全部唤醒
 *
 * 问题：多线程之间按顺序调用，实现A->B->C三个线程启动，要求如下：
 * A打印5次，B打印10次，C打印15次
 * then
 * A打印5次，B打印10次，C打印15次
 * 。。。 。。。
 * 10轮
 */
class ShareRource{
    private int number = 1;// A:1 B:2 C:3
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();
    private final int t1 = 5;
    private final int t2 = 10;
    private final int t3 = 15;

    public void print(){
        lock.lock();
        try{
            int t;
            Condition nowC;
            Condition nextC;
            int num = 0;
            int nextNumber;

            if("aaa".equals(Thread.currentThread().getName())){
                t = t1;
                nowC = c1;
                nextC = c2;
                num = 1;
                nextNumber = 2;
            }else if("bbb".equals(Thread.currentThread().getName())){
                t = t2;
                nowC = c2;
                nextC = c3;
                num = 2;
                nextNumber = 3;
            }else {
                t=t3;
                nowC = c3;
                nextC = c1;
                num = 3;
                nextNumber = 1;
            }

            // 判断
            while (number != num){
                nowC.await();
            }
            // 执行
            for (int i = 0; i < t; i++) {
                System.out.println(Thread.currentThread().getName() + "\t " + (i+1));
            }
            number = nextNumber;


            // 通知
            nextC.signal();

        }catch (Exception e){

        }finally {
            lock.unlock();
        }

    }
}
public class SyncAndReentrantLockDemo {
    public static void main(String[] args) {

        ShareRource shareRource = new ShareRource();
        new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                shareRource.print();
            }
        },"aaa").start();
        new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                shareRource.print();
            }
        },"bbb").start();
        new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                shareRource.print();
            }
        },"ccc").start();
    }
}

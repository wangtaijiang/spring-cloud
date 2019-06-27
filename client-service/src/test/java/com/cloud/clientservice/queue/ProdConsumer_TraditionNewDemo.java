/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.queue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 资源类
class ShareData{
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws Exception{
       lock.lock();
       try{
           // 1 判断
//           if (number != 0){ //虚假唤醒
           while (number != 0){
               // 等待，不能生产
               condition.await();
           }
           // 2 干活
           number++;
           System.out.println(Thread.currentThread().getName() + "\t " + number);

           // 通知唤醒
           condition.signalAll();
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           lock.unlock();
       }

    }

    public void decrement() throws Exception{
        lock.lock();
        try{
            // 1 判断
//            if (number == 0){
            while (number == 0){
                // 等待，不能生产
                condition.await();
            }
            // 2 干活
            number--;
            System.out.println(Thread.currentThread().getName() + "\t " + number);

            // 通知唤醒
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
/**
 * @authur wtj
 * @date 2019/6/26    16:39
 *
 * 2.0 release
 *
 * 新版 传统生产者消费者
 * 一个初始值为0的变量，两个线程对其交替操作，一个加一 一个减一，交替5轮
 *
 * 1    线程  操作(方法)  资源类
 * 2    判断  干活  通知唤醒
 * 3    防止虚假唤醒机制
 */
public class ProdConsumer_TraditionNewDemo  {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"CC").start();

        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"DD").start();
    }
}

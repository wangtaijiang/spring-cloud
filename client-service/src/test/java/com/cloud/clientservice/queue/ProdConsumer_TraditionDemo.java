/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class ShareDataOld{
    private volatile List<Integer> number = new ArrayList<>(1);

    public void addOne()  {
        synchronized(number){
            while (number.size() !=0){
                try {
                    System.out.println(Thread.currentThread().getName() + "\t wait  number = " + number);
                    number.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            number.add(1);
            System.out.println(Thread.currentThread().getName() + "\t add  " + number.get(0));
            number.notifyAll();
        }

    }
    public void decOne()  {
        synchronized(number){
            while (number.size() ==0){
                try {
                    System.out.println(Thread.currentThread().getName() + "\t wait  number = " + number);
                    number.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            number.clear();
            System.out.println(Thread.currentThread().getName() + "\t clear" );
            number.notifyAll();
        }

    }
}

/**
 * @authur wtj
 * @date 2019/6/26    17:04
 *
 * 1.0 release
 */
public class ProdConsumer_TraditionDemo {
    public static void main(String[] args) {

        ShareDataOld shareDataOld = new ShareDataOld();
        new Thread(() ->{
            while (true) {
                try {
                    shareDataOld.addOne();
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"aaa").start();
        new Thread(() ->{
            while (true) {
                try {
                    shareDataOld.decOne();
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"bbb").start();
        new Thread(() ->{
            while (true) {
                try {
                    shareDataOld.addOne();
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"ccc").start();
        new Thread(() ->{
            while (true) {
                try {
                    shareDataOld.decOne();
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"ddd").start();

    }
}

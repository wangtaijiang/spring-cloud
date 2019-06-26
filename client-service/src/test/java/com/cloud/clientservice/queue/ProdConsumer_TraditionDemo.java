/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.queue;

class ShareDataOld{
    private Integer number = 0;

    public void addOne()  {
        synchronized(number){
            while (number !=0){
//                synchronized(number){
                try {
                    number.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //                }

            }
            //        synchronized(number){
            number++;
            System.out.println(Thread.currentThread().getName() + "\t " + number);
//            synchronized(number){
                number.notifyAll();
//            }

            //        }
        }

    }
    public void decOne()  {
        synchronized(number){
            while (number==0){
//                synchronized(number){
                try {
                    number.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //                }
            }
            //        synchronized(number){
            number--;
            System.out.println(Thread.currentThread().getName() + "\t " + number);
//            synchronized(number){
                number.notifyAll();
//            }
            //        }
        }

    }
}
/**
 * @authur wtj
 * @date 2019/6/26    17:04
 * 待完善
 */
public class ProdConsumer_TraditionDemo {
    public static void main(String[] args) {

        ShareDataOld shareDataOld = new ShareDataOld();

        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareDataOld.addOne();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"aaa").start();
        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareDataOld.decOne();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"bbb").start();
        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareDataOld.addOne();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"ccc").start();
        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    shareDataOld.decOne();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"ddd").start();

    }
}

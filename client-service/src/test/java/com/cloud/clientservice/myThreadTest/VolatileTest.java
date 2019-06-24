/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.myThreadTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @authur wtj
 * @date 2019/6/14    21:48
 */
public class VolatileTest {

    public static  void main2(String[] args) throws InterruptedException {

        Thread t1 = new Thread3();
        Thread t2 = new Thread3();
        t1.start();
        t2.start();
    }

    private static class Thread3 extends Thread{

        int i =1 ;

        public void run(){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i+=1;
            System.out.println(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static  void main(String[] args) throws InterruptedException {
        Map  map = new HashMap();

        map.put("111","111");
        Thread1 thread1 = new Thread1(map);
        Thread1 thread2 = new Thread1(map);

//        thread1.setName("thread1");
//        thread2.setName("thread2");

        thread1.start();
        System.out.println(Thread1.currentThread().getId()+"==="+Thread1.currentThread().getName()+"==="+map);
        Thread.sleep(500);
        thread2.start();

//        Thread.sleep(2000);
        System.out.println(Thread1.currentThread().getId()+"==="+Thread1.currentThread().getName()+"==="+map);
    }

    private static class Thread1 extends Thread{
        Map map;
//        volatile Map map;
        Thread1(Map map){
            this.map = map;
        }
        public void run(){
            System.out.println(Thread1.currentThread().getId()+"==="+Thread1.currentThread().getName()+"==="+map);
            map.put("aaa","AAA");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            map.put("bbb","BBB");

            //            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            map.put("ccc","CCC");
            System.out.println(Thread1.currentThread().getId()+"==="+Thread1.currentThread().getName()+"==="+map);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread1.currentThread().getId()+"==="+Thread1.currentThread().getName()+"==="+map);

        }
    }

    private static class Thread2 extends Thread{
        Map map;
//        volatile Map map;
        Thread2(Map map){
            this.map = map;
        }
        public void run(){
            System.out.println(Thread2.currentThread().getId()+"==="+ Thread2.currentThread().getName()+"==="+map);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put("111","AAA");

            map.put("222","BBB");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            map.put("333","CCC");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread2.currentThread().getId()+"==="+ Thread2.currentThread().getName()+"==="+map);

        }
    }
}

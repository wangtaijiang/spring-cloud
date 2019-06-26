/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.myThreadTest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;


/**
 * 原子类
 */
class MyData // MyData.java ---> MaData.class ---> JVM字节码
{
    volatile int number = 0;

    public void addTo100(){
        this.number = 100;
    }

    // number前面加了关键字volatile，但不保证原子性
    public void addPlusPlus(){
        number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();// 默认值为0
    public void  setAtomicInteger(){
        this.atomicInteger.getAndIncrement();
    }

}

/**
 * @authur wtj
 * @date 2019/6/14    21:48
 *
 * 1 验证volatile的可见性
 *   1.1  int number = 0 ;numbere 之前没有volatile修饰；
 *   1.2 添加了volatile，可以解决可见性问题。
 *
 * 2. 验证volatile不保证原子性
 *    2.1 原子性指的是什么意思？
 *        不可分割，完整性，也即某个线程正在做某个具体业务是，中间不可以加塞或者分割。
 *        需要整体完整，要么同时成功，要么同时失败。
 *
 *    2.2 volatile不保证原子性
 *
 *    2.3 why
 *        number++ 不是原子操作
 *
 *    2.4 解决办法
 *        * 加sync
 *        * 使用JUC下的AtomicInteger
 *  *
 *
 */
public class VolatileTest {

    /**
     * 1. volatile 可以保证可见性，及时通知其它线程，主物理内存的值已被修改
     */
    @Test
    public void testSeeOkByVolatile(){

        MyData myData = new MyData(); // 资源类
        new Thread(() ->{
            System.out.println(Thread.currentThread().getName() + "\t start");
            try {
                TimeUnit.SECONDS.sleep(3);
                myData.addTo100();
                System.out.println(Thread.currentThread().getName() + "\t update number 100");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();

        // 第二个线程就是main线程

        while (myData.number == 0){
            // main线程一直在等待循环，直到number值发生改变；
        }

        System.out.println(Thread.currentThread().getName() + "\t  thread end");
    }

    /**
     * 1. volatile 不可以保证原子性
     */
    @Test
    public void testFailAtomicByVolatile(){

        MyData myData = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() ->{
                for (int j = 0; j < 1000; j++) {
                    myData.addPlusPlus();
                    myData.setAtomicInteger();
                }
            },String.valueOf(i)).start();

        }

        // 需要等待上面20线程都计算完成后，再用main线程取得最终结果值是多少？
   /*     // 方法1 暂停一会线程
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        // 方法2
        // 大于2 的原因，除当前main线程，还有守护线程，做gc
        while (Thread.activeCount() > 2 ){
            /**
             * yield()方法的作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU时间。注意：放弃的时间不确定，可能一会就会重新获得CPU时间片
             *
             * 它与 sleep()类似，只是不能由用户指定暂停多长时间，并且 yield()方法只能让同优先级的线程有执行的机会,采用 yieid 可以将 CPU 的使用权让给同一个优先级的线程
             */
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t number = " + myData.number );
        System.out.println(Thread.currentThread().getName() + "\t atomicInteger = " + myData.atomicInteger );
    }


}

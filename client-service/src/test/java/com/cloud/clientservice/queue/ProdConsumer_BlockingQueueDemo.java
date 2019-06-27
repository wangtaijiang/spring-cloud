/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang3.StringUtils;

class ShareDataSource{
    private volatile boolean flag = true;// 默认开启，进行生产 + 消费  volatile保证线程间可见性
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    BlockingQueue<String> blockingQueue = null;

    public ShareDataSource(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }

    public void product() throws InterruptedException {
        String data = null;
        boolean returnValue;

        while (flag){
            data = atomicInteger.incrementAndGet() + "";
            returnValue = blockingQueue.offer(data,2l, TimeUnit.SECONDS);
            if(returnValue){
                System.out.println(Thread.currentThread().getName() + "\t 插入队列" + data+"成功");
                TimeUnit.SECONDS.sleep(1);
            }else {
                System.out.println(Thread.currentThread().getName() + "\t 插入队列" + data+"失败");
            }

        }
        System.out.println(Thread.currentThread().getName() + "\t 生产结束");
    }

    public void consumer() throws InterruptedException {
        String result = null;
        while (flag){
            result = blockingQueue.poll(2l,TimeUnit.SECONDS);

            if(StringUtils.isEmpty(result)){
                flag = false;
                System.out.println(Thread.currentThread().getName() +"\t 超过2秒钟没有消费到，退出！");
            }else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + "\t 消费" + result +" 成功");
            }
        }
        System.out.println(Thread.currentThread().getName() +"\t 消费退出！");
    }

    public void stop(){
        this.flag = false;
    }
}
/**
 * @authur wtj
 * @date 2019/6/26    16:40
 *3.0 release
 *
 * volatile/CAS/atomicInteger/blockingQueue/线程交互/原子引用
 */
public class ProdConsumer_BlockingQueueDemo {

    public static void main(String[] args) {
        ShareDataSource shareDataSource = new ShareDataSource(new ArrayBlockingQueue<>(10));

        new Thread(() ->{
            try {
                System.out.println(Thread.currentThread().getName() +"\t 生产线程启动。。。");
                shareDataSource.product();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"product").start();
        new Thread(() ->{
            try {
                System.out.println(Thread.currentThread().getName() +"\t 消费线程启动。。。");
                shareDataSource.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"consumer").start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shareDataSource.stop();
        System.out.println(Thread.currentThread().getName() + "\t 5秒钟时间到停止！");


    }
}

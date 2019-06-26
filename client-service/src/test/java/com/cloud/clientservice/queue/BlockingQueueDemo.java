/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @authur wtj
 * @date 2019/6/26    15:22
 *
 * 1   queue    队列
 *
 * 2   blockingQueue    阻塞队列
 *     2.1 阻塞队列有没有好的一面
 *
 *     2.2 不得不阻塞，怎么管理
 *
 *
 */
public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {

        testAddAndRemove();
        System.out.println("===============");
        testOfferAndPoll();
        System.out.println("==================");
        testPutAndTake();
        System.out.println("==================");
        testOfferAndPoll2();

    }

    public static void testAddAndRemove(){
        // List list = new ArrayList();
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
//        System.out.println(blockingQueue.add("x"));

        // 检查队首元素
        System.out.println(blockingQueue.element());

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
    }

    public static void testOfferAndPoll(){
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        System.out.println(blockingQueue.offer("x"));

        System.out.println(blockingQueue.peek());

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
    }

    // 过时不候
    public static void testOfferAndPoll2() throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);


        System.out.println(blockingQueue.offer("a",2l, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2l, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2l, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2l, TimeUnit.SECONDS));

    }

    // 死战不退，不见不散
    public static void testPutAndTake() throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);


        blockingQueue.put("a");
        blockingQueue.put("a");
        blockingQueue.put("a");
        System.out.println("=============");
       // blockingQueue.put("b");

        blockingQueue.take();
        blockingQueue.take();
        blockingQueue.take();
       // blockingQueue.take();

    }
}

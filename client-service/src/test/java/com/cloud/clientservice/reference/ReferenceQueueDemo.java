/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @authur wtj
 * @date 2019/6/28    17:26
 */
public class ReferenceQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue();
        WeakReference<Object> weakReference = new WeakReference<>(o1,referenceQueue);

        System.out.println(o1);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
        System.out.println("+++++++++++++++++++++++++++");

        o1 = null;
        System.gc();

        Thread.sleep(500);
        System.out.println(o1);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
        /**
         * 结果：
         * java.lang.Object@4f8e5cde
         * java.lang.Object@4f8e5cde
         * null
         * +++++++++++++++++++++++++++
         * null
         * null
         * java.lang.ref.WeakReference@504bae78
         */

    }
}

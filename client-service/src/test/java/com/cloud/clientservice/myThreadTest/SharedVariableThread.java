/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.myThreadTest;

/**
 * @authur wtj
 * @date 2019/6/14    10:32
 */

    public class SharedVariableThread extends Thread {
        private int count = 5;

        @Override
        public void run() {
            super.run();
            count--;
            System.out.println("由 " + SharedVariableThread.currentThread().getName() + " 计算，count=" + count);
        }

        public static void main(String[] args) throws InterruptedException {

            SharedVariableThread mythread = new SharedVariableThread();
            // 下列线程都是通过mythread对象创建的
            Thread a = new Thread(mythread, "A");
            Thread b = new Thread(mythread, "B");
            Thread c = new Thread(mythread, "C");
            Thread d = new Thread(mythread, "D");
            Thread e = new Thread(mythread, "E");
            System.out.println("主线程开始调用子线程！");
            a.start();
            a.join();
            b.start();
            c.start();
            d.start();
            c.join();
            e.start();
            System.out.println("主线程结束！");
        }
    }



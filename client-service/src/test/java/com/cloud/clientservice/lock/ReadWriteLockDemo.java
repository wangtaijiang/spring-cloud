/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 资源类 模拟一个缓存
class MyCache{
    private volatile Map<String,Object> map = new HashMap<>();
//    private Lock lock = new ReentrantLock();
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();


    // write
    public void put(String key,Object value){
        reentrantReadWriteLock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + "\t put start...");
            // 模拟网络拥堵
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(key,value);
            System.out.println(Thread.currentThread().getName() + "\t put end...");
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            reentrantReadWriteLock.writeLock().unlock();
        }

    }

    // read
    public void get(String key){
        reentrantReadWriteLock.readLock().lock();
        try{

            System.out.println(Thread.currentThread().getName() + "\t get start...");
            // 模拟网络拥堵
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName() + "\t get end...result = " +result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            reentrantReadWriteLock.readLock().unlock();
        }
       }

//       public void clear(){
//        map.clear();
//       }
}

/**
 * @authur wtj
 * @date 2019/6/26    11:41
 *
 * 多个线程同时都一个资源类没有任何问题，所以为了满足并发量，读取共享资源应该可以同时进行
 * 但是
 * 如果有一个线程去写共享资源，就不应该再有其他线程可以对该资源进行读或者写
 * 也即：
 *      读--读共存
 *      读--写不共存
 *      写--写不共存
 *
 *      写操作：原子 + 独占,整个过程必须是一个完整的统一体，中间不允许被打断、分割
 */
public class ReadWriteLockDemo {



    public static void main(String[] args) {

        MyCache myCache = new MyCache();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                myCache.put(finalI +"", finalI +"");
            },String.valueOf(i)).start();
        }
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                myCache.get(finalI +"");
            },String.valueOf(i)).start();
        }
    }

}

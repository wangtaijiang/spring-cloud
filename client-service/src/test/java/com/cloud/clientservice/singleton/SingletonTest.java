/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.singleton;

/**
 * @authur wtj
 * @date 2019/6/25    11:30
 *
 */

public class SingletonTest {
    private static volatile SingletonTest instance = null;

    private SingletonTest(){

        System.out.println(Thread.currentThread().getName() + "\t 我是SingletonTest的构造方法");
    }

//    public static SingletonTest getInstance(){
    public static synchronized SingletonTest getInstance(){
        if(instance == null){

            instance =  new SingletonTest();
        }
        return instance;
    }

    // DCL (Double Check Lock 双端检锁机制
    public static SingletonTest getInstance1(){
//    public static synchronized SingletonTest getInstance(){
        if(instance == null){

            synchronized(SingletonTest.class){
                if(instance == null){
                    instance =  new SingletonTest();
                }
            }

        }
        return instance;
    }
    public static void main(String[] args){

       // 单线程版本的 单例模式
        System.out.println(SingletonTest.getInstance() == SingletonTest.getInstance());
        System.out.println(SingletonTest.getInstance() == SingletonTest.getInstance());
        System.out.println(SingletonTest.getInstance() == SingletonTest.getInstance());

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingletonTest.getInstance();
            },String.valueOf(i)).start();
        }
    }

}

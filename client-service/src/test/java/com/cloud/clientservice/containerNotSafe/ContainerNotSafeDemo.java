/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.containerNotSafe;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @authur wtj
 * @date 2019/6/25    17:34
 * 集合类不安全问题
 *
 */
public class ContainerNotSafeDemo {

    public static void main(String[] args){

        listNotSafe();
        setNotSafe();
        mapNotSafe();

    }

    /**
     * ArrayList
     */
    public static void listNotSafe(){
        // 问题代码
        //        List<String> list = Arrays.asList("a","b","c");
        //        list.forEach(System.out::println);
        //        List<String> list = new ArrayList<>();

        // 方案1
        //        List<String> list = new Vector<>();

        // 方案2
        //        List<String> list = Collections.synchronizedList(new ArrayList<>());

        // 方案3
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < 30; i++) {
            new Thread(() ->{
                list.add(UUID.randomUUID().toString().substring(8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
        // java.util.ConcurrentModificationException
        /**
         * 1  故障现象
         *    java.util.ConcurrentModificationException
         *
         *
         * 2   导致原因
         *     并发争抢修改导致，参考花名册签到情况
         *     一个人正在写入，另外一个过来抢夺，导致数据不一致异常，  并发修改异常
         *
         * 3   解决方案
         *    3.1 new vector<>();
         *    3.2 Collections.synchronizedList(new ArrayList<>());
         *    3.3 new CopyOnWriteArrayList<>();
         *
         *
         * 4   优化建议
         *
         */
    }

    /**
     * HashSet
     */
    public static void setNotSafe(){
        // 问题代码

        //        Set<String> set = new HashSet<>();



        // 方案
        Set<String> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() ->{
                set.add(UUID.randomUUID().toString().substring(8));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
        // java.util.ConcurrentModificationException


    }

    /**
     * HashMap
     */
    public static void mapNotSafe(){
        // 问题代码
//        Map<String ,String> map = new HashMap<>();



        // 方案
        Map<String ,String> map = new ConcurrentHashMap<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() ->{

                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(8));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
        // java.util.ConcurrentModificationException


    }
}







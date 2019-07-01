/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.reference;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * @authur wtj
 * @date 2019/6/28    16:44
 */
public class WeakReferenceDemo {

    public static void main(String[] args) {
       testWeakReference();

        testWeakHashMap();
    }

    public static void testWeakReference(){
        Object o1 = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(o1);
        System.out.println(o1);
        System.out.println(weakReference.get());

        System.out.println("_+__+_+_++_+_+_+__++__+++_++_");
        o1 = null;
        System.gc();
        System.out.println(o1);
        System.out.println(weakReference.get());

        /**
         * 结果：
         * java.lang.Object@4f8e5cde
         * java.lang.Object@4f8e5cde
         * _+__+_+_++_+_+_+__++__+++_++_
         * null
         * null
         */
    }
    public static void testWeakHashMap(){

        myHashMap();
        System.out.println("=================================");
        myWeakHashMap();
        /**
         * 结果：
         * {1=HashMap}
         * =================================
         * {1=HashMap}
         * =================================
         * {1=HashMap}	 size = 1
         * =================================
         * {2=HashMap}
         * =================================
         * {2=HashMap}
         * =================================
         * {}	 size = 0
         */
    }
    public static void myHashMap(){
        HashMap<Integer,String > map = new HashMap<>();
        Integer key = new Integer(1);
        String value = "HashMap";

        map.put(key,value);
        System.out.println(map);
        System.out.println("=================================");

        key = null;
        System.out.println(map);
        System.out.println("=================================");

        System.gc();
        System.out.println(map + "\t size = " + map.size());
    }

    public static void myWeakHashMap(){
        WeakHashMap<Integer,String > map = new WeakHashMap<>();

        Integer key = new Integer(2);
        String value = "HashMap";

        map.put(key,value);
        System.out.println(map);
        System.out.println("=================================");

        key = null;
        System.out.println(map);
        System.out.println("=================================");

        System.gc();
        System.out.println(map + "\t size = " + map.size());
    }
}

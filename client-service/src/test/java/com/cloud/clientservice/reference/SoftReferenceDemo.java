/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.reference;

import java.lang.ref.SoftReference;

/**
 * @authur wtj
 * @date 2019/6/28    16:23
 */
public class SoftReferenceDemo {

    /**
     * 内存够用，不收
     */
    public static void softRef_Momory_Enough(){

        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());

        o1 = null;
        System.gc();

        System.out.println(o1);
        System.out.println(softReference.get());
    }

    /**
     * 内存不够用，回收
     * JVM配置，产生大对象并配置小内存，导致OOM，看软引用回收情况
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    public static void softRef_Momory_NotEnough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());

        o1 = null;
        System.gc();

        try{
            byte[] bytes = new byte[30*1024*1024];
        }catch (Exception e){

            e.printStackTrace();
        }finally {
            System.out.println(o1);
            System.out.println(softReference.get());
        }
    }

    public static void main(String[] args) {

//        softRef_Momory_Enough();
        /**
         * 结果：
         * java.lang.Object@4f8e5cde
         * java.lang.Object@4f8e5cde
         * null
         * java.lang.Object@4f8e5cde
         */

        softRef_Momory_NotEnough();
        /**
         * [GC (Allocation Failure) [PSYoungGen: 1172K->504K(1536K)] 1693K->1280K(5632K), 0.0008352 secs] [Times:
         * user=0.00 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 1528K->504K(1536K)] 2304K->1482K(5632K), 0.0025356 secs] [Times:
         * user=0.00 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 1528K->504K(1536K)] 2506K->1788K(5632K), 0.0009840 secs] [Times:
         * user=0.00 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 1528K->504K(1536K)] 2812K->2008K(5632K), 0.0010978 secs] [Times:
         * user=0.00 sys=0.00, real=0.00 secs]
         * java.lang.Object@4f8e5cde
         * java.lang.Object@4f8e5cde
         * [GC (System.gc()) [PSYoungGen: 655K->288K(1536K)] 2159K->2120K(5632K), 0.0144620 secs] [Times: user=0.00
         * sys=0.00, real=0.01 secs]
         * [Full GC (System.gc()) [PSYoungGen: 288K->0K(1536K)] [ParOldGen: 1832K->1346K(4096K)] 2120K->1346K(5632K),
         * [Metaspace: 3231K->3231K(1056768K)], 0.0217218 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
         * [GC (Allocation Failure) [PSYoungGen: 10K->0K(1536K)] 1357K->1346K(5632K), 0.0057105 secs] [Times: user=0
         * .00 sys=0.00, real=0.01 secs]
         * [GC (Allocation Failure) [PSYoungGen: 0K->0K(1536K)] 1346K->1346K(5632K), 0.0241727 secs] [Times: user=0
         * .00 sys=0.00, real=0.02 secs]
         * [Full GC (Allocation Failure) [PSYoungGen: 0K->0K(1536K)] [ParOldGen: 1346K->1240K(4096K)] 1346K->1240K
         * (5632K), [Metaspace: 3234K->3234K(1056768K)], 0.0119713 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
         * [GC (Allocation Failure) [PSYoungGen: 0K->0K(1536K)] 1240K->1240K(5632K), 0.0003562 secs] [Times: user=0
         * .00 sys=0.00, real=0.00 secs]
         * [Full GC (Allocation Failure) [PSYoungGen: 0K->0K(1536K)] [ParOldGen: 1240K->1222K(4096K)] 1240K->1222K
         * (5632K), [Metaspace: 3234K->3234K(1056768K)], 0.0119465 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
         * null
         * null
         * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
         * 	at com.cloud.clientservice.reference.SoftReferenceDemo.softRef_Momory_NotEnough(SoftReferenceDemo.java:46)
         * 	at com.cloud.clientservice.reference.SoftReferenceDemo.main(SoftReferenceDemo.java:67)
         */

    }
}

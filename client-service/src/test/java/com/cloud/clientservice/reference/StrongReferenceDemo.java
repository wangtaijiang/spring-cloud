/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.reference;

/**
 * @authur wtj
 * @date 2019/6/28    16:23
 */
public class StrongReferenceDemo {
    public static void main(String[] args) {
        Object o1 = new Object(); // 这样定义的默认值就是强引用
        Object o2 = o1; // o2引用赋值
        o1 = null;// 置空
        System.gc();
        System.out.println(o2);
    }
}

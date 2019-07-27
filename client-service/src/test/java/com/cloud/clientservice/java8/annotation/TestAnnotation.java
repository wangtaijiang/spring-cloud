/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/27    22:11
 *
 * 重复注解与类型注解
 */
public class TestAnnotation
{

    private  String string;

    @MyAnnotation("Hello")
    @MyAnnotation("World")
    public void show(@MyAnnotation("aaa") String string){
        this.string = string;
    }

    @Test
    public void test1() throws NoSuchMethodException {
        Class<TestAnnotation> testAnnotationClass = TestAnnotation.class;
        Method show = testAnnotationClass.getMethod("show");
        MyAnnotation annotation = show.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);

        MyAnnotation[] declaredAnnotationsByType = show.getDeclaredAnnotationsByType(MyAnnotation.class);
        System.out.println(declaredAnnotationsByType);
        System.out.println(show.getAnnotationsByType(MyAnnotation.class));
        for (MyAnnotation myAnnotation : declaredAnnotationsByType) {
            System.out.println(myAnnotation.value());
        }
    }
}

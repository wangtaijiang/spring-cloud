/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

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
        Method[] methods = testAnnotationClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Method show = testAnnotationClass.getMethod("show",String.class);

        Annotation[] annotations = show.getAnnotations();
        System.out.println(annotations.length);
        Arrays.asList(annotations).stream().map(annotation -> 222).forEach(System.out::println);

        MyAnnotation[] declaredAnnotationsByType = show.getDeclaredAnnotationsByType(MyAnnotation.class);

        for (MyAnnotation myAnnotation : declaredAnnotationsByType) {
            System.out.println(myAnnotation.value());
        }
    }
}

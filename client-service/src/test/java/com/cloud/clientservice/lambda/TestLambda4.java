/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/24    21:23
 *
 * Java8 内置的四大核心函数式接口：
 *      1、Consumer<T>:消费型接口
 *          void accpet(T t)
 *      2、Supplier<T>:供给型接口
 *          T get();
 *      3、Function<T,R>:函数型接口
 *          R apply(T t)
 *      4、Predicate<T>:断言型接口
 *          boolean test(T t);
 */
public class TestLambda4 {

    List<Student> studentList = Arrays.asList(
            new Student(1l,"张三",18,"男",1),
            new Student(1l,"李四",22,"男",2),
            new Student(1l,"王五",15,"男",1),
            new Student(1l,"赵六",21,"男",3)
    );

    //Consumer<T>
    @Test
    public void test1(){

        consumer(422,m -> {
            System.out.println("422消费55剩余" + (422 -55) + "元");
        });
    }
    public void consumer(double money, Consumer<Double> consumer){
        consumer.accept(money);

    }

    //Supplier<T>
    @Test
    public void test2(){

        getNumberList(10,() ->{
           return (int)Math.random() * 10;
        });

        Supplier<String> stringSupplier = () ->{
            return  "hello world";
        };
        System.out.println(stringSupplier.get());
    }
    // 需求：产生指定个数的整数，并放入集合
    public List<Integer>  getNumberList(int num,Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer integer = supplier.get();
            list.add(integer);
        }
        return list;
    }

    //Function<T,R>:函数型接口
    @Test
    public void test3(){
        String s = strHandler("北京欢迎你   哈哈  ", (x) -> {
            return x.trim();
        });
        System.out.println(s);
        System.out.println(strHandler("北京欢迎你   哈哈  ",(x) -> {
            return x.substring(0,2);
        }));
    }

    //需求：处理字符串
    public String strHandler(String s, Function<String,String> function){
        String apply = function.apply(s);
        return apply;
    }

    //Predicate<T>:断言型接口
    @Test
    public void test4(){

        List<String> stringList = Arrays.asList("hehe","中国","helloworld","你好","beijing");
        List<String> list = filterStr(stringList, x -> x.length() < 3);
        list.stream().forEach(System.out::println);
    }
    //需求：将满足条件的字符串放入集合
    public List<String> filterStr(List<String> strings, Predicate<String> predicate){
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            if(predicate.test(string)){
                list.add(string);
            }
        }
        return list;
    }
}

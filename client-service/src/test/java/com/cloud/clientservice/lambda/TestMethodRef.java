/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/24    22:40
 *
 * 一、方法引用：若Lambda体中的内容有方法已经实现了，我们可以使用”方法引用“
 *          （可以理解为方法引用是Lambda表达式的另外一种表现形式
 *
 *   主要三种语法格式：
 *
 *      对象：：实例方法名
 *
 *      类：：静态方法名
 *
 *      类：：实例方法名
 *
 *   注意：
 *      ①Lambda体中调用方法额参数列表与返回值类型，需要与函数式接口中抽象方法的函数列表和返回值类型一致；
 *      ②若Lambda参数列表中的第一参数是实例方法的调用者，而第二个参数是实例方法的参数，可以使用ClassName：：method；
 *
 * 二、构造器引用
 *  格式：
 *  ClassName：：new
 *
 *  注意：需要调用的构造器的参数列表要与函数式接口中的抽象方法的参数列表一致；
 *
 * 三、数组引用
 *
 *  格式：
 *  Type::new;
 *
 */
public class TestMethodRef {

    //对象：：实例方法名
    @Test
    public void test1(){
        Consumer<String> consumer = x -> System.out.println(x);

        PrintStream ps = System.out;
        Consumer<String> consumer1 = ps::println;

        consumer1.accept("hhejkkjlkj ");
    }

    @Test
    public void test2(){
        Student student = new Student();
        Supplier<String> stringSupplier = () -> student.getName();
        String s = stringSupplier.get();
        System.out.println(s);

        Supplier<Integer> integerSupplier = student::getAge;
        Integer integer = integerSupplier.get();
        System.out.println(integer);
    }

    //类：：静态方法名
    @Test
    public void test3(){
        Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);
        Comparator<Integer> comparator1 = Integer::compare;
    }
    //类：：实例方法名
    @Test
    public void test4(){
        BiPredicate<String,String> biPredicate = (x,y) -> x.equals(y);
        BiPredicate<String,String> biPredicate1 = String::equals;
    }

    //构造器引用
    @Test
    public void test5(){
        Supplier<Student> studentSupplier = () -> new Student();
        Supplier<Student> studentSupplier1 = Student::new;
        Student student = studentSupplier1.get();
        System.out.println(student);

        Function<Integer,Student> function = (integer) -> new Student(integer);
        Function<Integer,Student> function1 = Student::new;
        Student apply = function.apply(38);
        System.out.println(apply);
        Student apply1 = function1.apply(88);
        System.out.println(apply1);

    }

    //数组引用
    @Test
    public void test6(){
        Function<Integer,String[]> function = x -> new String[x];
        String[] apply = function.apply(5);
        System.out.println(apply.length);

        Function<Integer,String[]> function1 = String[]::new;
        String[] apply1 = function1.apply(8);
        System.out.println(apply1.length);
    }


}

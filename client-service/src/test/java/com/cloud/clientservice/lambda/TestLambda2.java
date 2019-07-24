/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * @authur wtj
 * @date 2019/7/24    20:33
 *
 * 一、Lambda表达式的基础语法：Java8 引入了一个新的操作符 ' -> ' 该操作符称为箭头操作符或者Lambda操作符
 *                              箭头操作符将 Lambda表达式拆分为两部分：
 *                              左侧：Lambda表达式的参数
 *                              右侧：Lambda表达式所需执行的功能，即Lambda体
 *
 *      1、语法格式一：无参数，无返回值
 *          () -> System.out.println("hello world");
 *
 *      2、语法格式二：有一个参数，但无返回值
 *          (x) -> System.out.println("x");
 *
 *      3、语法格式三：若只有一个参数，小括号可以不写
 *          x -> System.out.println("x");
 *
 *      4、语法格式四：有两个以上参数，有返回值，并且Lambda体重有多条语句
 *           Comparator<Integer> comparator = (x,y) ->{
 *             System.out.println("函数式编程");
 *             Integer.compare(x,y);
 *             return x.compareTo(y);
 *         };
 *
 *      5、语法格式五：若Lambda体中只有一条语句，return 和大括号都可省略不写
 *          Comparator<Integer> comparator = (x,y) ->x.compareTo(y);
 *
 *      6、语法格式六：Lambda表达式的参数列表的数据类型可以省略不写，因为JVM编译器可以通过上下文推断出数据类型，即类型推断
 *                  Comparator<Integer> comparator = (Integer x, Integer y) ->x.compareTo(y);
 *                  Comparator<Integer> comparator = (x,y) ->x.compareTo(y);
 *
 *      小结：左右遇一括号省、左侧推断类型省、能省则省
 *
 *  二、Lambda表达式需要“函数式接口”支持
 *      函数式接口：接口中只有一个抽象方法的接口，称为函数式接口。
 *                  可以使用注解@FunctionalInterface 修饰，
 *                  可以检查是否是函数式接口
 *
 */
public class TestLambda2 {

    @Test
    public void test1(){

        int num = 0; //jdk 1.7之前必须是final,1.8可以不加，但默认是final修饰
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world    1" + "\t" + num);
            }
        };

        Runnable runnable1 = () -> System.out.println("hello world  1" + "\t" + num);

        runnable.run();
        System.out.println("===============");
        runnable1.run();
    }

    @Test
    public void test2(){
        Consumer<String> consumer = (x) -> System.out.println(x);
//        Consumer<String> consumer2 = x -> System.out.println(x);
        consumer.accept("hello world    2");
    }

    @Test
    public void test3(){
//        Consumer<String> consumer = (x) -> System.out.println(x);
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("hello world    2");
    }

    @Test
    public void test4(){
        Comparator<Integer> comparator = (x,y) ->{
            System.out.println("函数式编程");
            Integer.compare(x,y);
            return x.compareTo(y);
        };
    }

    @Test
    public void test5(){
        Comparator<Integer> comparator = (Integer x, Integer y) ->x.compareTo(y);
        Comparator<Integer> comparator1 = Integer::compareTo;
    }

    @Test
    public void test6(){
        show(new HashMap<>());
    }

    public void show(Map<String,Integer> map){

    }

    //需求：对一个数进行运算
    @Test
    public void test7(){
        Integer operation = operation(88, x -> x * x);
        System.out.println(operation);
        System.out.println(operation(88,x -> x + 88));
    }

    public Integer operation(Integer num,MyFunction myFunction){
        return myFunction.getValue(num);
    }


}

/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/26    19:10
 *
 *  一、Stream 的三个操作步骤：
 *
 *      1、创建Stream
 *
 *      2、中间操作
 *          ①筛选与切片
 *          * filter--接收Lambda，从流中排除某些元素
 *          * limit(n)--截断流，使其元素不超过给定数量
 *          * skip(n)--跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit互补(n)
 *          * distinct--筛选，通过流所生成元素的hashCode()和equals()去重
 *          ②映射
 *          * map--接收Lambda，将元素转换成其他形式或提取信息。接受一个函数作为参数，该函数会被应用到每个元素上，并将其映射为一个新的元素。
 *          * flatMap--接收一个函数作为参数，将流中的每个值都转换成另一个流，然后把所有流连接成一个流
 *          ③排序
 *          * sorted() --自然排序
 *          * sorted(Comparator c)--定制排序
 *
 *      3、终止操作（终端操作）
 *          （1）查找与匹配
 *          ①allMatch--检查是否匹配所有元素
 *          ②anyMatch--检查是否至少匹配一个元素
 *          ③moneMatch--检查是否没有匹配所有元素
 *          ④findFirst--返回第一个元素
 *          ⑤findAny--返回当前流中任意元素
 *          ⑥count--返回六中元素的总个数
 *          ⑦max--返回流中最大值
 *          ⑧min--返回流中最小值
 *          （2） 归约
 *          * reduce(T identity,BinaryOperator b)  /   reduce(BinaryOperator b)--可以将流中元素反复结合起来，得到一个值
 *          （3）收集
 *          * collect--将流转换为其他形式。
 *              接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
 *              ①分组
 *                  .collect(Collectors.groupingBy(Student::getGender));
 *              ②多级分组
 *                  .collect(Collectors.groupingBy(Student::getGender, Collectors.groupingBy(s -> {//可自定义分组方式
 *                     if (s.getAge() >= 18) {
 *                         return "成年人";
 *                     } else {
 *                         return "未成年人";
 *                     }
 *                 })
 *              ③分区
 *                   Map<Boolean, List<Student>> collect =
 *                 studentList.stream().collect(Collectors.partitioningBy(s -> s.getAge() >= 18));
 *
 */
public class TestStreamAPI {

    //1、创建Stream
    @Test
    public void test1(){
        //1.可以通过Collection 系列集合提供的stream() 或parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //2.通过Arrays中的静态方法Stream（）获取数组流
        Student[] students = new Student[5];
        Stream<Student> stream1 = Arrays.stream(students);

        //3.通过Stream类中静态方法of()
        Stream<String> aa = Stream.of("aa", "dd", "da");

        //4.创建无限流
        //①迭代
        Stream<Integer> integerStream = Stream.iterate(1, x -> x + 2);
//        integerStream.forEach(System.out::println);
        integerStream.limit(10).forEach(System.out::println);

        //②生成
        Stream.generate(() -> (int)(Math.random() * 10) )
                .limit(10).forEach(System.out::println);

    }



    // 外部迭代：由自己操作
    @Test
    public void test3(){
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    List<Student> studentList = Arrays.asList(
            new Student(1l,"张三",14,"男",1),
            new Student(1l,"李四",22,"男",2),
            new Student(1l,"王五",15,"女",1),
            new Student(1l,"赵六",21,"男",3)
    );
    //2、中间操作

    /**
     * 筛选与切片
     * filter--接收Lambda，从流中排除某些元素
     * limit(n)--截断流，使其元素不超过给定数量
     * skip(n)--跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit互补(n)
     * distinct--筛选，通过流所生成元素的hashCode()和equals()去重
     *
     */
    // 内部迭代：迭代操作由StreamAPI完成
    @Test
    public void test2(){
        //中间操作：不会执行任何操作
        Stream<Student> studentStream = studentList.stream().filter(x -> x.getAge() > 21);
        //终止操作：一次性执行所有内容，即“惰性求值”
        System.out.println(studentStream.count());

        System.out.println(studentList.stream().filter(x ->{
            System.out.println("短路");
            return x.getAge()>1;
        }).limit(2).count());

        System.out.println(studentList.stream().filter(x -> x.getAge()>1).skip(2).count());

        Student student = new Student(1l, "赵六", 21, "男", 3);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student);
        System.out.println(studentList.size());
        System.out.println(studentList.stream().distinct().count());

    }


    /**
     * 映射
     * map--接收Lambda，将元素转换成其他形式或提取信息。接受一个函数作为参数，该函数会被应用到每个元素上，并将其映射为一个新的元素。
     * flatMap--接收一个函数作为参数，将流中的每个值都转换成另一个流，然后把所有流连接成一个流
     *
     */

    @Test
    public void test4(){

        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
        list.stream().forEach(System.out::println);
        System.out.println("=================================");
        Stream<Stream<Character>> streamStream = list.stream().map(TestStreamAPI::getCharacters);
        streamStream.forEach((stream) ->{
            stream.forEach(System.out::println);
        });
        System.out.println("=================================");
        list.stream().flatMap(TestStreamAPI::getCharacters).forEach(System.out::println);

        /*
        map 与 faltmap的区别类似于 list里的add和addAll方法；
         */
    }

    public static Stream<Character> getCharacters(String str){
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    /**
     * 排序
     * sorted() --自然排序
     * sorted(Comparator c)--定制排序
     */
    @Test
    public void test5(){
        List<String> list = Arrays.asList("aaa","bbb","ccc");
        list.stream().sorted().forEach(System.out::println);

        studentList.stream().sorted((s1,s2) ->{
          if(s1.getAge() == s2.getAge()){
              return s1.getName().compareTo(s2.getName());
          }else {
             return Integer.compare(s1.getAge(),s2.getAge());
          }
        }).forEach(System.out::println);
    }

    /**
     * 查找与匹配
     *  *          ①allMatch--检查是否匹配所有元素
     *  *          ②anyMatch--检查是否至少匹配一个元素
     *  *          ③moneMatch--检查是否没有匹配所有元素
     *  *          ④findFirst--返回第一个元素
     *  *          ⑤findAny--返回当前流中任意元素
     *  *          ⑥count--返回六中元素的总个数
     *  *          ⑦max--返回流中最大值
     *  *          ⑧min--返回流中最小值
     */

    @Test
    public void test6(){
        boolean b = studentList.stream()
                .allMatch(x -> "女".equals(x.getGender()));
        System.out.println(b);

        boolean b1 = studentList.stream().anyMatch(x -> "女".equals(x.getGender()));
        System.out.println(b1);

        boolean b2 = studentList.stream().noneMatch(x -> "女".equals(x.getGender()));
        System.out.println(b2);

        Optional<Student> first = studentList.stream().sorted((s1, s2) -> -Integer.compare(s1.getAge(), s2.getAge()))
                .findFirst();
        System.out.println(first.get());

        Optional<Student> any = studentList.parallelStream()
                .filter(x -> "男".equals(x.getGender()))
                .findAny();
        System.out.println(any.get());

        System.out.println(studentList.stream().count());

        System.out.println(studentList.stream().max((s1, s2) -> {
            if (s1.getAge() == s2.getAge()) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        }).get());

        System.out.println(studentList.stream().map(Student::getAge).min(Integer::compareTo).get());
    }

    /**
     * 归约
     * reduce(T identity,BinaryOperator b)  /   reduce(BinaryOperator b)--可以将流中元素反复结合起来，得到一个值
     */

    @Test
    public void test7(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer reduce = list.stream()
                .reduce(15, (x, y) -> x + y);//将 15 作为起始值
        System.out.println(reduce);// 30

        Optional<Integer> reduce1 = studentList.stream().map(Student::getAge)
                .reduce(Integer::sum);//无起始值，故结果为Optional
        System.out.println(reduce1.get());
    }

    /**
     * 收集
     * collect--将流转换为其他形式。接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
     *
     */
    @Test
    public void test8(){
        List<String> collect = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(collect);

        Set<String> collect1 = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
        System.out.println(collect1);

        LinkedList<String> collect2 = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toCollection(LinkedList::new));//自定义集合类型
        System.out.println(collect2);

        Long collect3 = studentList.stream()
                .collect(Collectors.counting());
        System.out.println(collect3);

        Double collect4 = studentList.stream()
                .collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(collect4);

        IntSummaryStatistics collect5 = studentList.stream()
                .collect(Collectors.summarizingInt(Student::getAge));
        System.out.println(collect5);//IntSummaryStatistics{count=4, sum=76, min=15, average=19.000000, max=22}
        Integer collect6 = studentList.stream()
                .collect(Collectors.summingInt(Student::getAge));
        System.out.println(Integer.compare(collect6, (int) collect5.getSum()));

    }
    //分组
    @Test
    public void test9(){
        Map<String, List<Student>> collect = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(collect);
    }
    //多级分组
    @Test
    public void test10(){
        Map<String, Map<String, List<Student>>> collect = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.groupingBy(s -> {
                    if (s.getAge() >= 18) {
                        return "成年人";
                    } else {
                        return "未成年人";
                    }
                })));
        System.out.println(collect);
    }
    //分区
    @Test
    public void test11(){
        Map<Boolean, List<Student>> collect =
                studentList.stream().collect(Collectors.partitioningBy(s -> s.getAge() >= 18));
        System.out.println(collect);
        /**
         * {false=[Student(id=1, name=张三, age=14, gender=男, group=1), Student(id=1, name=王五, age=15, gender=女, group=1)],
         * true=[Student(id=1, name=李四, age=22, gender=男, group=2), Student(id=1, name=赵六, age=21, gender=男, group=3)]}
         */
    }
    @Test
    public void test12(){
        String collect = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining());
        System.out.println(collect);//张三李四王五赵六

        String collect1 = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));
        System.out.println(collect1);//张三,李四,王五,赵六

        String collect2 = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining(",","===","***"));
        System.out.println(collect2);//===张三,李四,王五,赵六***
    }

    /*
    问题1：给定一个数字列表，返回一个由每个数的平方构成的列表
    即给出[1,2,3,4,5],返回[1,4,9,16,25]
    */
    @Test
    public void question1(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(collect);

    }

    /*
    利用map和reduce，得到流中有多少个Student
     */
    @Test
    public void question2(){
        Optional<Integer> reduce = studentList.stream()
                .map(x -> 1)
                .reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        Optional<Integer> reduce1 = studentList.stream()
                .map(x -> 1)
                .reduce(Integer::sum);
        System.out.println(reduce1.get());
    }
}

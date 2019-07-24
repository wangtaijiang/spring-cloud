/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

import org.junit.Test;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/24    21:23
 */
public class TestLambda3 {

    List<Student> studentList = Arrays.asList(
            new Student(1l,"张三",18,"男",1),
            new Student(1l,"李四",22,"男",2),
            new Student(1l,"王五",15,"男",1),
            new Student(1l,"赵六",21,"男",3)
    );

    // 需求1.调用Collections.sort()方法，使用定制化排序
    @Test
    public void test1(){
        Collections.sort(studentList,(s1,s2) ->{
            if(s1.getAge() == s2.getAge()){
                return s1.getName().compareTo(s2.getName());
            }else {
                return -Integer.compare(s1.getAge(),s2.getAge());
            }
        });
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("====================");
        studentList.stream().forEach(System.out::println);
    }

    @Test
    public void test11(){
        BiPredicate<Student,Student > biPredicate = (s1, s2) -> {
            return s1.getAge() == s2.getAge();
        };
        BiPredicate<Student,Student > biPredicate1 = (s1, s2) -> s1.getAge() == s2.getAge();
        boolean test = biPredicate1.test(new Student(), new Student(1));
        System.out.println(test);
        //        Collections.sort(studentList, BiPredicate<>
    }

    // 需求2. ①声明函数式接口，接口中声明抽象方法，public String getValue(String str)
    //        ②声明类 TestLambda，类中编写方法使用接口作为参数，将一个字符串转行成大写，
    //          并作为方法的返回值
    //        ③再将一个字符串的汉字进行截取子串
    @Test
    public void test2(){

        String s1 = strHandler("haha  你司 ", s -> s.trim());
        System.out.println(s1);

        String dalsld = strHandler("dalsld", s -> s.toUpperCase());
        System.out.println(dalsld);

        String hehhe中国字heh = strHandler("hehhe中国字heh", s -> s.substring(5, 8));
        System.out.println(hehhe中国字heh);

    }
    public String strHandler(String s,MyFunction1 m1){
        return m1.getValue(s);
    }
    @Test
    public void test21(){

    }

    //需求3.①声明一个带两个泛型的函数式接口，泛型类型为<T,V>,T为参数，R为返回值
    //      ②接口中声明对应抽象方法
    //      ③在TestLambda类中声明方法，使用接口作为参数，计算两个long型的和
    //      ④再计算两个long型参数的乘积
    @Test
    public void test3(){

        method(3l,4l,(x,y) -> x + y);
        method(3l,4l,(x,y) -> x * y);
    }

    public void method(Long l1,Long l2,MyFunction2<Long,Long> myFunction2){
        System.out.println(myFunction2.getValue(l1, l2));
    }
}

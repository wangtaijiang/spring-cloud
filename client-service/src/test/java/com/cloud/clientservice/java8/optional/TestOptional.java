/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.optional;

import java.util.Optional;

import org.junit.Test;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/27    18:36
 */
public class TestOptional {
    /**
     * Optional 容器类的常用方法：
     * 1、Optional.of(T t):创建一个Optional实例
     * 2、Optional.empty():创建一个空的Optional的实例
     * 3、Optional.ofNullable(T t):若 t不为 null，创建Optional实例，否则创建空实例
     * 4、isPresent():判断是否包含值
     * 5、orElse(T t):如果调用对象包含值，返回值，否则返回t
     * 6、orElseGet(Supplier s):如果调用对象包含值，返回该值，否则返回s获取的值
     * 7、map(Function f):如果有值对其进行处理，并返回处理后的Optional，否则返回Optional.empty()
     * 8、flatmap(Function mapper):与map类似，要求返回值必须是Optional
     */
    @Test
    public void test1(){
        Optional<Student> student = Optional.of(new Student());//Student(id=null, name=null, age=0, gender=null, group=0)
//        Optional<Student> student = Optional.of(null);//java.lang.NullPointerException
//        Optional<Student> student = Optional.empty();//java.util.NoSuchElementException: No value present
//        Optional<Student> student = Optional.ofNullable(null);//java.util.NoSuchElementException: No value present

       if(student.isPresent()){
           System.out.println(student.get());
       }
        Student student1 = student.orElse(new Student(1L, "", 3, "", 4));
        System.out.println(student1);

        Student student2 = student.orElseGet(Student::new);
        System.out.println(student2);

        Optional<Student> student3 = Optional.ofNullable(new Student(1L, "aaa", 3, "", 4));
        Optional<Integer> integer = student3.map(Student::getAge);
        System.out.println(integer.get());

        Optional<String> s = student3.flatMap((student4 -> Optional.of(student4.getName())));
        System.out.println(s.get());

    }

    //example:获取man 中women的name
    @Test
    public void test2(){

        Man man = new Man();
        String wemenName = getWemenName(man);
        System.out.println(wemenName);
        System.out.println("==========================");

        String wemenName2 = getWemenName2(Optional.ofNullable(null));
        System.out.println(wemenName2);
        System.out.println("===========================");
        Optional<Women> women = Optional.ofNullable(new Women());
        Optional<NewMan> newMan = Optional.ofNullable(new NewMan(women));
        String wemenName21 = getWemenName2(newMan);
        System.out.println(wemenName21);

    }
    public String getWemenName(Man man){
        if(man != null){
            Women women = man.getWomen();
            if(women != null){
                return women.getName();
            }
        }
        return "default";
    }

    public String getWemenName2(Optional<NewMan> man){
        return man.orElse(new NewMan())
                .getWomen()
                .orElse(new Women("default2"))
                .getName();
    }

}

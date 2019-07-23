/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/23    20:34
 */
public class TestLambda {

    //原来的匿名内部类
    @Test
    public void test1(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }


    //Lambda表达式
    @Test
    public void test2(){
        Comparator<Integer> comparator = (x,y)->Integer.compare(x,y);
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }




    @Test
    public void test3(){
        List<Student> students = filterStudent(studentList);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("===================");
        List<Student> students1 = filterStudent2(studentList);
        for (Student student : students1) {
            System.out.println(student);
        }
    }

    List<Student> studentList = Arrays.asList(
            new Student(1l,"张三",18,"男",1),
            new Student(1l,"李四",22,"男",2),
            new Student(1l,"王五",15,"男",1),
            new Student(1l,"赵六",21,"男",3)
    );

    //需求1:获取年龄大于20的学生信息
    public List<Student> filterStudent(List<Student> students){
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if(student.getAge() > 20){
                studentList.add(student);
            }
        }
        return studentList;
    }
    //需求2:获取1组的学生信息
    public List<Student> filterStudent2(List<Student> students){
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if(student.getGroup() == 1){
                studentList.add(student);
            }
        }
        return studentList;
    }

    //优化方式1：策略设计模式
    @Test
    public void test4(){
        List<Student> studentList = filterStudent(this.studentList, new FilterStudentByAge());
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("============================");
        List<Student> studentList1 = filterStudent(this.studentList, new FilterStudentByGroup());
        for (Student student : studentList1) {
            System.out.println(student);
        }
    }
    public List<Student> filterStudent(List<Student> students , MyPredicate<Student> myPredicate){
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if(myPredicate.filter(student)){
                studentList.add(student);
            }
        }
        return studentList;
    }

    //优化方式2：策略模式之 匿名内部类
    @Test
    public void test5(){
        List<Student> studentList = filterStudent(this.studentList, new MyPredicate<Student>() {
            @Override
            public boolean filter(Student student) {
                return student.getAge() > 20;
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("======================");
        List<Student> studentList1 = filterStudent(this.studentList, new MyPredicate<Student>() {
            @Override
            public boolean filter(Student student) {
                return student.getGroup() == 1;
            }
        });

        for (Student student : studentList1) {
            System.out.println(student);
        }
    }

    //优化方式3：策略模式之 Lambda表达式
    @Test
    public void test6(){
        List<Student> students = filterStudent(this.studentList, student -> student.getAge() > 20);
      students.forEach(System.out::println);

        System.out.println("====================");
        List<Student> students1 = filterStudent(this.studentList, student -> student.getGroup() == 1);
        for (Student student : students1) {
            System.out.println(student);
        }
    }

    //优化方式4：策略模式之 Lambda表达式Stream操作
    @Test
    public void test7(){

        studentList.stream()
                    .filter(student -> student.getAge()>20)
                    .forEach(System.out::println);

        System.out.println("====================");

        studentList.stream().filter(student -> student.getGroup() == 1).forEach(System.out::println);
        System.out.println("==============================");
        studentList.stream().map(student -> student.getName()).forEach(System.out::println);
        System.out.println("==============================");
        studentList.stream().map(student -> student.getName()).limit(2).forEach(System.out::println);
    }
}

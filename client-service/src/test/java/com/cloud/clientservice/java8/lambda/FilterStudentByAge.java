/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.lambda;

import com.cloud.pojo.entities.Student;

/**
 * @authur wtj
 * @date 2019/7/23    21:23
 */
public class FilterStudentByAge implements MyPredicate<Student> {
    @Override
    public boolean filter(Student student) {
        return student.getAge() > 20 ;
    }
}

/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.entities;

import com.alibaba.excel.metadata.BaseRowModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @authur wtj
 * @date 2019/6/15    23:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseRowModel {

    private Long id;

    private String name;

    private int age;

    private String gender;

    private int group;


    public Student(int i){
        this.age = i;
    }

}

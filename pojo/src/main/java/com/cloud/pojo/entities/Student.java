/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.entities;

import com.alibaba.excel.metadata.BaseRowModel;

import lombok.Data;

/**
 * @authur wtj
 * @date 2019/6/15    23:26
 */
@Data
public class Student extends BaseRowModel {

    private Long id;

    private String name;

    private int age;

    private String gender;

    private int group;

}

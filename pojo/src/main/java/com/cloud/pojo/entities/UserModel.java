/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.entities;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import lombok.Data;

/**
 * @authur wtj
 * @date 2019/6/15    22:56
 */
@Data
public class UserModel extends BaseRowModel {
    @ExcelProperty(value = "ID",index = 0) // 这个注解用来表明id字段的列名称为ID，及下表位置为0
    private Long id;

    @ExcelProperty(value = "姓名",index = 1)
    private String name;

    @ExcelProperty(value = "年龄",index = 2)
    private int age;

}

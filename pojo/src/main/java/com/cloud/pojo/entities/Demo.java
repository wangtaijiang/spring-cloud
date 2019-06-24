/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.entities;

import java.util.List;

import lombok.Data;

/**
 * @authur wtj
 * @date 2019/5/26    16:19
 */
@Data
public class Demo {
    private String name;
    private String desc;
    private List<Demo> items;
}

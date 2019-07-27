/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @authur wtj
 * @date 2019/7/27    19:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Women {
    private String name = "anna";//一定不为null的值就没必要用Optional包装
}

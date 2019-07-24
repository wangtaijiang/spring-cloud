/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

/**
 * @authur wtj
 * @date 2019/7/24    21:18
 */
@FunctionalInterface
public interface MyFunction {
    public Integer getValue(Integer num);
}

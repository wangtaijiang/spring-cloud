/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.lambda;

/**
 * @authur wtj
 * @date 2019/7/24    21:18
 */
@FunctionalInterface
public interface MyFunction2<T,R> {
    public R  getValue(T t1,T t2);
}

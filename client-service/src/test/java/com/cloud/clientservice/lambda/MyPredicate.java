/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.lambda;

/**
 * @authur wtj
 * @date 2019/7/23    21:22
 */
public interface MyPredicate<T> {
    public boolean filter(T t);
}

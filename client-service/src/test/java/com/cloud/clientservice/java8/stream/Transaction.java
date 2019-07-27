/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @authur wtj
 * @date 2019/7/27    16:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {


    private Trader trader;
    private int year;
    private int value;

}

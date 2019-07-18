/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @authur wtj
 * @date 2019/7/12    13:53
 */
@SpringBootApplication
@EnableScheduling
public class ActiveMQProducer {
    public static void main(String[] args) {
        SpringApplication.run(ActiveMQProducer.class);
    }
}

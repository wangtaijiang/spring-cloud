/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.springcloud.config;

import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * @authur wtj
 * @date 2019/7/12    13:56
 */
@Configuration
@EnableJms
public class ConfigBean {

    @Value("${myqueue}")
    private String myQueue;

//    @Bean
//    public Queue getMyQueue() {
//        return new ActiveMQQueue(myQueue);
//    }

    @Bean
    public Topic getMyQueue() {
        return new ActiveMQTopic(myQueue);
    }
}

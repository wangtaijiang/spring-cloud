/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.springcloud.service;

import java.util.UUID;

import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @authur wtj
 * @date 2019/7/12    14:01
 */
@Service
public class ActiveMQService {

//    @Autowired
//    Queue queue;
    @Autowired
    Topic topic;
    @Autowired
    JmsMessagingTemplate jmsMessageTemplate;

//    public void produce (){
//        jmsMessageTemplate.convertAndSend(queue, UUID.randomUUID().toString().substring(0,6));
//    }
//
//    @Scheduled(fixedDelay = 5000)
//    public void produceMessageScheduled(){
//        jmsMessageTemplate.convertAndSend(queue,"schedule========" + UUID.randomUUID().toString().substring(10));
//    }

    @Scheduled(fixedDelay = 2000)
        public void produceMessageScheduled(){
            jmsMessageTemplate.convertAndSend(topic,"schedule========" + UUID.randomUUID().toString().substring(10));
        }

}

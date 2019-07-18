/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.springcloud.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.springcloud.ActiveMQProducer;

/**
 * @authur wtj
 * @date 2019/7/12    14:07
 */
@SpringBootTest(classes = ActiveMQProducer.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ActiveMQProduceTest {

    @Autowired
    ActiveMQService activeMQService;

//    @Test
//    public void testSend(){
//        activeMQService.produce();
//    }
}

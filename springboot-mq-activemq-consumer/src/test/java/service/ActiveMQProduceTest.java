/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import springcloud.ActiveMQConsumer;
import springcloud.service.ActiveMQService;

/**
 * @authur wtj
 * @date 2019/7/12    14:07
 */
@SpringBootTest(classes = ActiveMQConsumer.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ActiveMQProduceTest {

    @Autowired
    ActiveMQService activeMQService;

    @Test
    public void testReceive(){

    }
}

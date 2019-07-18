/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package springcloud.service;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @authur wtj
 * @date 2019/7/12    14:01
 */
@Service
public class ActiveMQService {



    @JmsListener(destination = "${myqueue}")
    public void receive (TextMessage message){

        try {
            System.out.println("收到的消息\t"+ message.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

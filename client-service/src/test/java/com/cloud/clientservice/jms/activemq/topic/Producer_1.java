/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.jms.activemq.topic;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @authur wtj
 * @date 2019/7/9    20:57
 */
public class Producer_1 {

    public static String ACTIVEMQ_URL = "tcp://192.168.99.100:61617";
    public static String TOPIC_NAME = "topic_1";

    public static void main(String[] args) throws JMSException {
        // 1. 创建连接工厂，按照给定的url地址，采用默认的用户名、密码 admin、admin
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        // 2. 通过链接工厂，获取connect并启动
        Connection connection = factory.createConnection();
        connection.start();

        // 3. 创建会话session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // 4. 创建目的地destination（明确是topic还是queue）
        Topic topic = session.createTopic(TOPIC_NAME);

        // 5. 创建消息的producer
        MessageProducer producer = session.createProducer(topic);

        // 6. 通过producer创建5条消息，并发送到MQ的quene里
        for (int i = 1; i <= 5; i++) {
            // 创建消息
            TextMessage textMessage = session.createTextMessage("message" + i);
            textMessage.setStringProperty("aaa","AAA");
            // 发送到queue
            producer.send(textMessage);

            MapMessage mapMessage = session.createMapMessage();
            mapMessage.setString("k1","mapMessage " + "\t" + i);
            producer.send(mapMessage);
        }


        // 7. 关闭资源
        producer.close();
        session.close();
        connection.close();

        System.out.println("topic_message发送消息到ActiveMQ成功！");
    }
}

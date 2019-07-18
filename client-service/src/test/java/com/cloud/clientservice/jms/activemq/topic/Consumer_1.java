/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.clientservice.jms.activemq.topic;

import java.io.IOException;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @authur wtj
 * @date 2019/7/9    21:01
 */
public class Consumer_1 {

    public static String ACTIVEMQ_URL = "tcp://192.168.99.100:61617";
    public static String TOPIC_NAME = "topic_1";

    public static void main(String[] args) throws JMSException, IOException {
        System.out.println("=========================2号cunsumer========================");
        // 1. 创建连接工厂，按照给定的url地址，采用默认的用户名、密码 admin、admin
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        // 2. 通过链接工厂，获取connect并启动
        Connection connection = factory.createConnection();
        connection.start();

        // 3. 创建会话session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // 4. 创建目的地destination（明确是topic还是queue）
        Topic topic = session.createTopic(TOPIC_NAME);

        // 5. 创建消息的consumer
        MessageConsumer consumer = session.createConsumer(topic);

        // 6. 获取消息
      /* 1. 同步阻塞方式（receive())
      订阅者或者接收者调用MessageConsumer的receive()方法来接收消息，
      recerive在接受到消息之前（或超时之前）将会一直阻塞
       while (true){
//            TextMessage message = (TextMessage) consumer.receive();// 参数为空的方法，如果结果为空，会一直等（不见不散）
            TextMessage message = (TextMessage) consumer.receive(5000L); // 5秒钟后不再receive（过时不候）
            if(message != null){
                System.out.println("消费者接收到的消息为："+ message);
            }else {
                break;
            }
        }

        // 7. 关闭资源
        consumer.close();
        session.close();
        connection.close();*/

        // 2.  通过监听的方式来消费消息
        // MessageConsumer consumer = session.createConsumer(queue);
        // 异步非阻塞方式（监听器onMessage（））
        // 订阅者或者接收者通过MesagConsumer的setMessageListener（MessageListener listener）注册一个消息监听器
        //当消息到达之后，系统自动调用监听器MessageListener的onMessage（Message message）方法
//        consumer.setMessageListener(new MessageListener() {
//            @Override
//            public void onMessage(Message message) {
//
//
//                if (null != message && message instanceof TextMessage){
//                    TextMessage textMessage = (TextMessage) message;
//                    try {
//                        System.out.println("接收到的消息为" + textMessage.getText());
//                    } catch (JMSException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
        // lamda表达式写法
        consumer.setMessageListener((message -> {
            if (null != message && message instanceof TextMessage){
                TextMessage textMessage = (TextMessage) message;
                try {
                    System.out.println("接收到的消息为" + textMessage.getText());
                    System.out.println("消息属性为：\t" + textMessage.getStringProperty("aaa"));
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            if (null != message && message instanceof MapMessage){
                MapMessage textMessage = (MapMessage) message;
                try {
                    System.out.println("接收到的消息为" + textMessage.getString("k1"));
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }));
        System.in.read();// 保持消费 不关掉
        consumer.close();
        session.close();
        connection.close();



    }
}

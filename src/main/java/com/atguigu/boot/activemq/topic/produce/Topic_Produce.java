package com.atguigu.boot.activemq.topic.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 15:17
 */
@Component
public class Topic_Produce {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopicMsg(){
        jmsMessagingTemplate.convertAndSend(topic,"*****Topic:"+ UUID.randomUUID().toString().substring(0,8));
        System.out.println("Topic produce Msg is over");
    }
}

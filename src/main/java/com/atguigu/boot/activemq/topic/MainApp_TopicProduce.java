package com.atguigu.boot.activemq.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 15:20
 */
@SpringBootApplication
@EnableScheduling
public class MainApp_TopicProduce {

    public static void main(String[] args) {
        SpringApplication.run(MainApp_TopicProduce.class, args);
    }

}

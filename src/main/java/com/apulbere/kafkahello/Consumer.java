package com.apulbere.kafkahello;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "topic1", groupId = "lambda")
    public void consume(String msg) {
        System.out.println("RECEIVED: " + msg);
    }

}

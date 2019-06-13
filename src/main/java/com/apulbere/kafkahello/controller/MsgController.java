package com.apulbere.kafkahello.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public MsgController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public String send(@RequestBody String msg) {
        kafkaTemplate.send("topic1", msg);
        return "{\"status\": \"sent\"}";
    }

}

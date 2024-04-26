package com.example.kafkaMicro;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "sample-topic", groupId = "sample-topic-group")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}


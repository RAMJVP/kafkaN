package com.example.kafkaMicro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 10000) // Send message every 10 second
    public void sendMessage() {
        String message = "Hello from Producer!";
        kafkaTemplate.send("sample-topic", message);
        System.out.println("Sent message: " + message);
    }
}

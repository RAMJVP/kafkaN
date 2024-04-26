package com.example.kafkaMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.example.kafkaMicro")
@EnableScheduling
public class KafkaMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMicroApplication.class, args);
	}

}

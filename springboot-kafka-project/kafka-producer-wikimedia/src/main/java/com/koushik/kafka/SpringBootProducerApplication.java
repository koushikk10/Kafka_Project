package com.koushik.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootProducerApplication.class);
        System.out.println("Hello world!");
    }
}
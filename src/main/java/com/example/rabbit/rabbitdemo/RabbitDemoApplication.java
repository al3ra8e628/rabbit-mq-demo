package com.example.rabbit.rabbitdemo;

import com.example.rabbit.rabbitdemo.integration.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Publisher.class)
public class RabbitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitDemoApplication.class, args);
    }

}


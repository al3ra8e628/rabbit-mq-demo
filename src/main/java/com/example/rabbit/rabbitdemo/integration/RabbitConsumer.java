package com.example.rabbit.rabbitdemo.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import static com.example.rabbit.rabbitdemo.integration.Publisher.INPUT_CHANNEL;

@Slf4j
@Component
public class RabbitConsumer {

    @StreamListener(target = INPUT_CHANNEL)
    public void receiveMessage(ReceivedMessage message) {
        log.info("new message received with with payload : " + message.toString());
    }

}

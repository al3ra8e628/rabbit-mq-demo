package com.example.rabbit.rabbitdemo.controllers;

import com.example.rabbit.rabbitdemo.integration.Publisher;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class Controller {

    private final Publisher publisher;

    public Controller(Publisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/sendMessage")
    public Message sendMessage(Message message) {
        log.info("new message sent by " + message.getSender() + " with title '" + message.getTitle() + "' and content '" + message.getContent() + "'");
        message.setReference(UUID.randomUUID().toString());
        publishMessage(message);
        return message;
    }

    private void publishMessage(Message message) {
        publisher.receiverOutput().send(new GenericMessage<>(message));
    }

    @Data
    public class Message {
        private String reference;
        private String sender;
        private String title;
        private String content;
    }

}

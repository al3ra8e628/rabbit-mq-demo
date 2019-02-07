package com.example.rabbit.rabbitdemo.integration;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ReceivedMessage {
    private String reference;
    private String sender;
    private String title;
    private String content;
}

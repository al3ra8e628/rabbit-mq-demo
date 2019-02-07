package com.example.rabbit.rabbitdemo.integration;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Publisher {

    String INPUT_CHANNEL = "inputChannel";
    String OUTPUT_CHANNEL = "outputChannel";

    @Output(OUTPUT_CHANNEL)
    MessageChannel receiverOutput();

    @Input(INPUT_CHANNEL)
    SubscribableChannel receiverInput();

}

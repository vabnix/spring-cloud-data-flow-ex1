package com.vaibhav.scdf.processor;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamMessageConverter;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.converter.MessageConverter;

@SpringBootApplication
@EnableBinding(Processor.class)
@Slf4j
@Log
public class ProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcessorApplication.class, args);
    }

    @Bean
    @StreamMessageConverter
    public MessageConverter greetingConverter() {
        return new GreetingMessageConverter();
    }

    @ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public GreetingResponseMessage transform(GreetingMessage greetingMessage) {
        log.info("received greeting message" + greetingMessage);
        return new GreetingResponseMessage(greetingMessage.getValue() + " response!");
    }

}

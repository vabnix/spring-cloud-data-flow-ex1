package com.vaibhav.scdf.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamMessageConverter;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.messaging.converter.MessageConverter;

import java.time.LocalDateTime;

@EnableBinding(Source.class)
@SpringBootApplication
public class SourceApplication {

    @Bean
    @StreamMessageConverter
    public MessageConverter greetingConverter() {
        return new GreetingConverter();
    }

    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }

    @InboundChannelAdapter(value = Source.OUTPUT)
    public Greeting source() {
        return new Greeting("hello world", LocalDateTime.of(2021, 1, 4, 15, 49, 7));
    }

}

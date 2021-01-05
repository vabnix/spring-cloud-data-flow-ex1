package com.vaibhav.scdf.processor;

import lombok.Getter;

@Getter
public class GreetingResponseMessage {
    private String response;

    public GreetingResponseMessage(String response) {
        this.response = response;
    }
}

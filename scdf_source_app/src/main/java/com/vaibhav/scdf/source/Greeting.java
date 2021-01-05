package com.vaibhav.scdf.source;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Greeting {
    String value;
    LocalDateTime dateTime;
}

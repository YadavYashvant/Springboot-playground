package com.yashvant.webspringboot.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Message {

    @Value("${app.message}")
    private String message;

    public String get() {
        return message;
    }

}

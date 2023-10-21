package com.yashvant.webspringboot.controllers;


import com.yashvant.webspringboot.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final Message message;

    public HelloController(Message message) {
        this.message = message;
    }

    @GetMapping(path = "/message")
    @ResponseBody
    public String message() {
        return message.get();
    }

}

package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseAPI {

    @RequestMapping("hello")
    public String sayHello() {
        return "HELLO NEW APPLICATION";
    }
}

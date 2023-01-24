package com.snoroc.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping()
public class MainController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class MainController {

    @Value("${test.value}")
    private String greeting;

    @GetMapping(path = "greetings")
    public ResponseEntity<String> getGreetings() {
        return new ResponseEntity<>("hello "+greeting, HttpStatus.OK);
    }
}

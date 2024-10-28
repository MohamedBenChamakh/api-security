package com.example.demo.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class SimpleController {


    @GetMapping("/hello")
    public ResponseEntity<String> sayHelloWorld(){
        return new ResponseEntity<>("HelloWorld",HttpStatus.OK);
    }


    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodBye(){
        return new ResponseEntity<>("GoodBye",HttpStatus.OK);
    }
}

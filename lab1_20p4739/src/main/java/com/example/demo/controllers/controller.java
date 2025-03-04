package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Abdallah";
    }
    @DeleteMapping("/hello")
    public String sayDelete(){
        return "Delete Abdallah";
    }

    @PostMapping("/hello")
    public String sayPost(){
        return "Post Abdallah";
    }

    @PutMapping("/hello")
    public String sayPut(){
        return "Put Abdallah";
    }
}

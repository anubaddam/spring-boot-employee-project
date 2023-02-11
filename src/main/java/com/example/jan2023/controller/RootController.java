package com.example.jan2023.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping("/")
    public String status(){
        return "SERVICE IS UP";
    }
    @GetMapping("/up")
    public String up(){
        return "SERVICE IS UP";
    }




}

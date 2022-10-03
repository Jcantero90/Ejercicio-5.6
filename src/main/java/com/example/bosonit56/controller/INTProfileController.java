package com.example.bosonit56.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:int.properties")
public class INTProfileController {

    @Value("${environment1}") String value;
    @Value("${bd.url1}") String value2;

    @GetMapping("/rutaINT")
    public String ReturnINT(){
        return value + "\n" + value2;
    }

}



package com.example.bosonit56.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:pro.properties")
public class PROProfileController {
    @Value("${environment3}") String value5;
    @Value("${bd.url3}") String value6;

    @GetMapping("/rutaPRO")
    public String ReturnINT(){
        return value5 + "\n" + value6;
    }

}

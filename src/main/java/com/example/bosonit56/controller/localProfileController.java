package com.example.bosonit56.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:local.properties")
public class localProfileController {

  @Value("${environment2}") String value3;
  @Value("${bd.url2}") String value4;

  @GetMapping("/rutaLocal")
  public String ReturnINT(){
    return value3 + "\n" + value4;
  }


}

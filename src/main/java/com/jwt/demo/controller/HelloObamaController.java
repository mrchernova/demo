package com.jwt.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class HelloObamaController {

    @RequestMapping("/yo")
    public String Main(){
        return "Hello Obama!";
    }

}

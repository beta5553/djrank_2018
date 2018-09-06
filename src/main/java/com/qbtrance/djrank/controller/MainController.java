package com.qbtrance.djrank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    static int visitNumber;

    {
        visitNumber=0;
    }

    @RequestMapping("/")
    public String main(){
        visitNumber++;
        return "Main from main controller, you are the visitor number: " + visitNumber;
    }
}

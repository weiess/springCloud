package com.yzl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {


    @GetMapping("/getData")
    public String getData(String name){
        return "hello get"+name;
    }

    @PostMapping("/postData")
    public String postData(String name){
        return "hello post"+name;
    }
}

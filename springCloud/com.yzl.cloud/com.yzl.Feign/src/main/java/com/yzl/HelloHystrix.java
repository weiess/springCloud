package com.yzl;


import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloService {


    @Override
    public String getHello(String name) {
        return "get ex";
    }

    @Override
    public String postHello(String name) {
        return "post ex";
    }
}

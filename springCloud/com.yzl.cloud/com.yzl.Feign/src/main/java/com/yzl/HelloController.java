package com.yzl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getData")
    public String getData(@RequestParam("name") String name){
        return helloService.getHello(name);
    }

    @GetMapping("/postData")
    public String postData(@RequestParam("name") String name){
        return helloService.postHello(name);
    }
}

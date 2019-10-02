package com.yzl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EURKA-CLIENT",fallback = HelloHystrix.class)
public interface HelloService {


    @RequestMapping(value = "/getData",method = RequestMethod.GET)
    String getHello(@RequestParam(value = "name") String name);


    @RequestMapping(value = "/postData",method = RequestMethod.POST)
    String postHello(@RequestParam(value = "name") String name);


}

package com.cq.servicefeign.controller;

import com.cq.servicefeign.service.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 14:19
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private IHello hello;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return hello.Hello(name);
    }
}

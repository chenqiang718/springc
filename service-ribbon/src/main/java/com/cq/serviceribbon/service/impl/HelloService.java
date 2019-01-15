package com.cq.serviceribbon.service.impl;

import com.cq.serviceribbon.service.IHello;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 10:54
 * @Version 1.0
 */
@Service
public class HelloService implements IHello {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String hello(String name) {
        return restTemplate.getForEntity("http://SERVER-HI/hello?name={1}", String.class,name).getBody();
    }

    public String error(String name){
        return "sorry "+name+",it's busy,wait for a time!";
    }
}

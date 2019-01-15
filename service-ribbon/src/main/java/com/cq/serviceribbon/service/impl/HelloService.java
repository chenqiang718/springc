package com.cq.serviceribbon.service.impl;

import com.cq.serviceribbon.service.IHello;
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
    public String hello(String name) {
        return restTemplate.getForEntity("http://SERVER-HI/hello?name={1}", String.class,name).getBody();
    }
}

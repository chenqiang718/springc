package com.cq.servicehi.service.impl;

import com.cq.servicehi.service.IHello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 9:59
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements IHello {
    @Value("${server.port}")
    private int port;
    @Override
    public String hello(String name) {
        return "Hello "+name+",I'm from "+port;
    }
}

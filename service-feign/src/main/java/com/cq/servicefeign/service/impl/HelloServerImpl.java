package com.cq.servicefeign.service.impl;

import com.cq.servicefeign.service.IHello;
import org.springframework.stereotype.Component;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 17:47
 * @Version 1.0
 */
@Component
public class HelloServerImpl implements IHello {
    @Override
    public String Hello(String name) {
        return "sorry "+name+",it's to busy,wait for a time!";
    }
}

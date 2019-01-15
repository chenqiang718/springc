package com.cq.servicefeign.service;

import com.cq.servicefeign.service.impl.HelloServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 14:16
 * @Version 1.0
 */
@FeignClient(value = "SERVER-HI",fallback = HelloServerImpl.class)
public interface IHello {
    @RequestMapping("/hello")
    String Hello(@RequestParam(value = "name") String name);
}

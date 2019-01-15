package com.cq.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 14:16
 * @Version 1.0
 */
@FeignClient(value = "SERVER-HI")
public interface IHello {
    @RequestMapping("/hello")
    String Hello(@RequestParam(value = "name") String name);
}

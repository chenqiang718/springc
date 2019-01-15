package com.cq.serviceribbon.configurion;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: chenqiang
 * @Date: 2019/1/15 10:49
 * @Version 1.0
 */
@Configuration
public class RestConfigurion {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

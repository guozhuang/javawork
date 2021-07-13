package com.example.demo.controller;

import com.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 作为微服务的客户端进行http访问
 */
@RestController
public class CloudCliHello {

    //这里需要进行restTemplate的bean转化【后续将这里也要进行标准化】：将bean的注入放到入口处
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/cloud/cli")
    public User cloudCliHelli() {
        //请求cloud的服务
        return this.restTemplate.getForObject(
                "http://docker.for.mac.host.internal:9000/1",
                User.class
        );
    }
}

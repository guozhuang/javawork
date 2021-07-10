package com.example.demo.controller;

import com.example.demo.properties.MyProperties1;
import com.example.demo.properties.MyProperties2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/properties")
@RestController
public class MyPropertiesController {
    private static final Logger log = LoggerFactory.getLogger(MyPropertiesController.class);

    private final MyProperties1 myProperties1;

    private final MyProperties2 myProperties2;

    //直接注入多个对象即可
    @Autowired
    public MyPropertiesController(MyProperties1 myProperties1,
            MyProperties2 myProperties2) {
        this.myProperties1 = myProperties1;
        this.myProperties2 = myProperties2;
    }

    @GetMapping("/1")
    public MyProperties1 myProperties1() {
        log.info("=================================================================================================");
        log.info(myProperties1.toString());//执行正常，但是配置没有读取
        log.info("=================================================================================================");
        return myProperties1;
    }

    @GetMapping("/2")
    public MyProperties2 myProperties2() {
        log.info("=================================================================================================");
        log.info(myProperties2.toString());//执行正常，但是配置没有读取
        log.info("=================================================================================================");
        return myProperties2;
    }
}

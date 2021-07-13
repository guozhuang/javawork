package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

//此处注解非常必要
@SpringBootApplication
@MapperScan(value = "com.example.demo.mapper")
//@Profile()//基于环境切换的配置
public class DemoApplication {

    @Bean//相当于自定义一个restTemplate的方法进行bean的转化
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

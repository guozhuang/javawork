package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//进行restful风格的数据标准化处理
@RestController
@RequestMapping("/my/users")
public class MybatisController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/{name}")
    public List<User> getUser(@PathVariable String name) {
        return userMapper.findByUsername(name);
    }
}

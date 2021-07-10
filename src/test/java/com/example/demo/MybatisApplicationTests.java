package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(MybatisApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() throws Exception {
        final List<User> u1 = userMapper.findByUsername("gz");
        log.info("[根据用户名查询] - [{}]", u1);
    }
}


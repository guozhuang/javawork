package com.example.demo.mapper;
//此处定义的是interface进行标准化
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 基于mybatis3.x版本后提供的注解方式
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户结果集
     * @param username 用户名
     * @return 查询结果
     */
    @Select("SELECT * FROM t_user WHERE username = #{username}")
    List<User> findByUsername(@Param("username") String username);

}

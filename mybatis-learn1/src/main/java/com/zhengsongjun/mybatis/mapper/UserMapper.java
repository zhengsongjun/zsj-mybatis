package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    List<User> selectUserAll();

    User selectUserById(String id);

    int insertUser(HashMap<String,Object> map);

    List<User> selectMySQLCase(@Param("user") User user);
}

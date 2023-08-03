package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface MapMapper {
    Map<String ,Object> selectById(int id);

    int selectAllCount();
}

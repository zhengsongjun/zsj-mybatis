package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.pojo.User;
import com.zhengsongjun.mybatis.util.SqlSessionUtil;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest extends TestCase {

    @Test
    public void testUserSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.selectUserAll();
        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    public void testUserInsert(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name","jj");
        hashMap.put("age",100);
        int insertCount = userMapper.insertUser(hashMap);
        System.out.println("操作成功，插入了" + insertCount + "条" );
        sqlSession.commit();
        sqlSession.close();
    }
}
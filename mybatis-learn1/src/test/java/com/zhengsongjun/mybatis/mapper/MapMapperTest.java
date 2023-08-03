package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.util.SqlSessionUtil;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;

public class MapMapperTest extends TestCase {
    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        MapMapper mapMapper = sqlSession.getMapper(MapMapper.class);
        Map<String,Object> mapTableItem = mapMapper.selectById(1);
        System.out.println("查出一个结果为"+mapTableItem);
        sqlSession.close();
    }


    @Test
    public void testSelectCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        MapMapper mapMapper = sqlSession.getMapper(MapMapper.class);
        int count = mapMapper.selectAllCount();
        System.out.println("查出的条数为"+count + "条");
        sqlSession.close();
    }

}
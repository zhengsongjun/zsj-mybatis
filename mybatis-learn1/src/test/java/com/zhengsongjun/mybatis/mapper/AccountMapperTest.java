package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.pojo.Account;
import com.zhengsongjun.mybatis.util.SqlSessionUtil;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AccountMapperTest extends TestCase {

    @Test
    public void testAccountMapperSelectByName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = accountMapper.selectAccountByName("我是mapper接口插入的");
        System.out.println(accountList);
        sqlSession.close();
    }

    @Test
    public void testAccountMapperSelectOrderBy() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountListById = accountMapper.selectOrderBy("id");
        System.out.println(accountListById);
        List<Account> accountListByCount = accountMapper.selectOrderBy("count");
        System.out.println(accountListByCount);
        sqlSession.close();
    }
}
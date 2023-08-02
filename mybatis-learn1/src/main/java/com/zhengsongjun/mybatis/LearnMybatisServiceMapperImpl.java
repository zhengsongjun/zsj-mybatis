package com.zhengsongjun.mybatis;

import com.zhengsongjun.mybatis.mapper.AccountMapper;
import com.zhengsongjun.mybatis.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LearnMybatisServiceMapperImpl {
    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        // select one
        Account account = accountMapper.selectAccount(1);
        System.out.println("我只能查一条信息"+account);
        // select list
        List<Account> accountList = accountMapper.selectAccountList();
        System.out.println("我查到了所有的信息，他们是"+ accountList);
        // delete
        Account accountDelete = new Account();
        accountDelete.setId(6);
        int deleteCount = accountMapper.deleteAccount(accountDelete);
        System.out.println("删除条数为" + deleteCount + "条");
        // update
        Account accountUpdate = new Account();
        accountUpdate.setId(1);
        accountUpdate.setCount("100");
        int updateCount = accountMapper.updateAccount(accountUpdate);
        System.out.println("更新条数为" + updateCount + "条");
        // insert
        Account accountInsert = new Account();
        accountInsert.setName("我是mapper接口插入的");
        accountInsert.setCount("12138");
        int insertCount = accountMapper.insertAccount(accountInsert);
        System.out.println("插入条数为" + insertCount + "条");
        session.commit();
        session.close();


    }
}

package com.zhengsongjun.mybatis;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LearnMybatisService {
    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sqlSessionFactory.openSession();
//
//        Account account = session.selectOne("AccountMapper.selectAccount",1);
//        System.out.println(account);
//        List<Account> accounts = session.selectList("AccountMapper.selectAccountList");
//        System.out.println(accounts);
//
//        //
//        Account accountInsert = new Account();
//        accountInsert.setName("插入名称1");
//        accountInsert.setCount("1000");
//        Integer insertCount = session.insert("AccountMapper.insertAccount",accountInsert);
//        System.out.println("插入数量为" + insertCount + "条");
//
//        Account accountUpdate = new Account();
//        accountUpdate.setName("修改名称1");
//        accountUpdate.setCount("1000");
//        accountUpdate.setId(1);
//        Integer updateCount = session.update("AccountMapper.updateAccount",accountUpdate);
//        System.out.println("更新数量为" + updateCount + "条");
//
//
//        Account accountDelete = new Account();
//        accountDelete.setId(2);
//        Integer deleteCount = session.delete("AccountMapper.deleteAccount",accountDelete);
//        System.out.println("删除数量为" + deleteCount + "条");
//        session.commit();
//
//        session.close();
    }

}

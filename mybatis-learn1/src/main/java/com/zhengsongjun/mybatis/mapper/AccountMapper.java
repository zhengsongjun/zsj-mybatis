package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.pojo.Account;

import java.util.List;

public interface AccountMapper {
    Account selectAccount(int id);

    List<Account> selectAccountByName(String name);
    List<Account> selectAccountList();

    List<Account> selectOrderBy(String property);

    int updateAccount(Account account);

    int deleteAccount(Account account);

    int insertAccount(Account account);
}

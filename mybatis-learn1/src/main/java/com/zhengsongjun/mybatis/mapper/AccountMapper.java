package com.zhengsongjun.mybatis.mapper;

import com.zhengsongjun.mybatis.Account;

import java.util.List;

public interface AccountMapper {
    Account selectAccount(int id);

    List<Account> selectAccountList();

    int updateAccount(Account account);

    int deleteAccount(Account account);

    int insertAccount(Account account);
}

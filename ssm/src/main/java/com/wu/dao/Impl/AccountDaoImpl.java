package com.wu.dao.Impl;

import com.wu.dao.IAccountDao;
import com.wu.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户的持久层实现类
 */

public class AccountDaoImpl implements IAccountDao {
    @Override
    public List<Account> findAllAccount() {
        System.out.println("查询了所有账户");
        return null;
    }
    @Override
    public void saveAccount(Account account) {
        System.out.println("保存了账户");
    }
}

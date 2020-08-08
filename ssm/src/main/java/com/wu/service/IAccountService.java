package com.wu.service;

import com.wu.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * @Version 1.0
 */
public interface IAccountService {
    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);
    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAllAccount();
}

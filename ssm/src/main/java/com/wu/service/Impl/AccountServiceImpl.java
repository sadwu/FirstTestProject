package com.wu.service.Impl;

import com.wu.dao.IAccountDao;
import com.wu.domain.Account;
import com.wu.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}

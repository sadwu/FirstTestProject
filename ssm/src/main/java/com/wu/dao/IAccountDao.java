package com.wu.dao;

import com.wu.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户的持久层接口
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * @Version 1.0
 */
@Repository("accountDao")
public interface IAccountDao {
    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();
}

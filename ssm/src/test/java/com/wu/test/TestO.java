package com.wu.test;

import com.wu.dao.IAccountDao;
import com.wu.domain.Account;
import com.wu.service.IAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class TestO {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.findAllAccount();
    }
    /**
     * 测试保存
     * @param
     * @throws Exception
     */
    @Test
    public void testSave() throws Exception {
        Account account = new Account();
        account.setName("test1");
        account.setMoney(5000f);
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session= factory.openSession();
        IAccountDao aDao = session.getMapper(IAccountDao.class);
        aDao.saveAccount(account);
        session.commit();
        session.close();
        in.close();
    }
    /**
     * 测试查询
     * @param
     * @throws Exception
     */
    @Test
    public void testFindAll() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session= factory.openSession();
        IAccountDao aDao = session.getMapper(IAccountDao.class);
        List<Account> list = aDao.findAllAccount();
        System.out.println(list);
        session.close();
        in.close();
    }
}



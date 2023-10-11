package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.service
 * @className: AccountServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/01 10:16
 */
@SuppressWarnings({"all"})
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public void save(AccountDao accountDao) {
        accountDao.save(account);
    }
    public void update(AccountDao accountDao) {
        accountDao.update(account);
    }
    public void delete(Integer id) {
        accountDao.delete(id);
    }
    public void findById(Integer id) {
        return accountDao.findById(id);
    }
    public void findAll() {
        return accountDao.findAll();
    }
}

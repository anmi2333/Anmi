package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.factory
 * @className: UserDaoFactory
 * @NAME: WANG CHAO
 * @date: 2023/08/30 22:52
 */
@SuppressWarnings({"all"})
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.dao.impl
 * @className: UserDao
 * @NAME: WANG CHAO
 * @date: 2023/08/31 11:26
 */
@SuppressWarnings({"all"})
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao save...");
    }
}

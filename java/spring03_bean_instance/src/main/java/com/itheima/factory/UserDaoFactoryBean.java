package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.factory
 * @className: OrderDaoFactoryBean
 * @NAME: WANG CHAO
 * @date: 2023/08/30 22:52
 */
@SuppressWarnings({"all"})
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂创建
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

    public boolean isSingleton() {
        return false;
    }
}

package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.factory
 * @className: OrderDaoFactoryBean
 * @NAME: WANG CHAO
 * @date: 2023/08/30 22:52
 */
@SuppressWarnings({"all"})
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
        userDao.save();
    }
}

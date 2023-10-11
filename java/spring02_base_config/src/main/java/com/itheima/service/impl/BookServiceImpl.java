package com.itheima.service.impl;

import com.itheima.dao.BookDao;

import com.itheima.service.BookService;

/**
 * @projectName: spring01
 * @package: com.itheima.service.impl
 * @className: UserService
 * @NAME: WANG CHAO
 * @date: 2023/08/30 15:24
 */
@SuppressWarnings({"all"})
public class BookServiceImpl implements BookService {
    private BookDao bookDao;//删除业务层中使用new的方式创建dao对象

    public void save() {
        System.out.println("book service save...");
        //bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;//提供对应的set方法
    }
}

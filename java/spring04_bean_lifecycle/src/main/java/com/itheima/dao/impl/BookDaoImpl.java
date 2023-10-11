package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @projectName: spring01
 * @package: com.itheima.dao.impl
 * @className: BookDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:14
 */
@SuppressWarnings({"all"})
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }

    @Override
    public void init() {
        System.out.println("book init...");

    }

    @Override
    public void destory() {
        System.out.println("book destory...");

    }
}

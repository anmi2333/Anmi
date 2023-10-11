package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.dao.impl
 * @className: AccountDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/01 10:18
 */
@SuppressWarnings({"all"})
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
            System.out.println("book dao save...");
    }

    @Override
    public void update() {
        System.out.println("update dao save...");
    }

    @Override
    public void delete() {
        System.out.println("delete dao save...");
    }

    @Override
    public void findById() {
        System.out.println("findById dao save...");
    }

    @Override
    public void findAll() {
        System.out.println("findAll dao save...");
    }
}

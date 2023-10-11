package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.dao.impl
 * @className: AccountDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/01 10:18
 */
@SuppressWarnings({"all"})
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        Long starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("book dao save...");
        }
        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime-starTime;
        System.out.println("执行1万次消耗时间" + totalTime + "ms");
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

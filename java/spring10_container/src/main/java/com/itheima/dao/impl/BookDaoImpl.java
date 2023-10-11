package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.*;

/**
 * @projectName: spring01
 * @package: com.itheima.dao.impl
 * @className: BookDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:14
 */
@SuppressWarnings({"all"})
public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void save() {
        System.out.println("book dao save..." + name);
    }
}

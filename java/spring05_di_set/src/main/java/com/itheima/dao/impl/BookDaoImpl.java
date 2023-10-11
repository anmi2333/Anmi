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

    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save..." + databaseName + "," + connectionNum);
    }
}

package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;

/**
 * @projectName: spring01
 * @package: com.itheima.dao.impl
 * @className: BookDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:14
 */
@SuppressWarnings({"all"})
public class OrderDaoImpl implements OrderDao {
    public void save() {
        System.out.println("order dao save...");
    }
}

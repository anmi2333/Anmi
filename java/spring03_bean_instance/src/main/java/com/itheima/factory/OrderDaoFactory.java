package com.itheima.service;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.factory
 * @className: OrderDaoFactory
 * @NAME: WANG CHAO
 * @date: 2023/08/30 22:52
 */
@SuppressWarnings({"all"})
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}

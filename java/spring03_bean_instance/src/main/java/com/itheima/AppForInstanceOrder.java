package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;
import com.itheima.service.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring01
 * @package: com.itheima
 * @className: App2
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:27
 */
@SuppressWarnings({"all"})
public class AppForInstanceOrder {
     public static void main(String[] args) {
      //获取Ioc容器
      ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
      //获取bean
         OrderDao orderDao = new OrderDaoFactory().getOrderDao();
         orderDao.save();
     }
}

package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.factory
 * @className: AppForInstanceUser
 * @NAME: WANG CHAO
 * @date: 2023/08/30 22:45
 */
@SuppressWarnings({"all"})
public class AppForInstanceUser {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao);
        userDao.save();
    }
}

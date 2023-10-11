package com.itheima;


import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @projectName: spring01
 * @package: com.itheima
 * @className: App
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:14
 */
@SuppressWarnings({"all"})
public class AppForDIAutoware {
    public static void main(String[] args) {
        //获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        //调用方法
        System.out.println(dataSource);
    }
}

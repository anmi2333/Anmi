package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima
 * @className: App
 * @NAME: WANG CHAO
 * @date: 2023/08/31 15:06
 */
@SuppressWarnings({"all"})
public class App {
    public static void main(String[] args) {

    //1.获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
    }
}

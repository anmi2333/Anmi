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
        //ApplicationContext ctx2 = new FileSystemXmlApplicationContext("/Users/dreamtank121/IdeaProjects/spring_10_container/src/main/resources/applicationContext.xml");
    //2.获取bean
    //DataSource dataSource = (DataSource) ctx.getBean("dataSource");
    //3.调用方法
    //System.out.println(dataSource);

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = ctx.getBean("bookDao",BookDao.class);
        BookDao bookDao3 = ctx.getBean(BookDao.class);
    bookDao.save();

    }
}

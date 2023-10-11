package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



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
    //2.获取bean
    //DataSource dataSource = (DataSource) ctx.getBean("dataSource");
    //3.调用方法
    //System.out.println(dataSource);

    BookDao bookDao = (BookDao) ctx.getBean("bookDao");
    bookDao.save();

    }
}

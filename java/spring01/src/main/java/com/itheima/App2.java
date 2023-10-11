package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
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
public class App2 {
     public static void main(String[] args) {
      //获取Ioc容器
      ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
      //获取bean
      BookDao bookDao = (BookDao) ctx.getBean("bookDao");
      bookDao.save();
      BookService bookService = (BookService) ctx.getBean("bookService");
      bookService.save();

     }
}

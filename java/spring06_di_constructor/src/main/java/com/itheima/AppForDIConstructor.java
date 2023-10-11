package com.itheima;


import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring01
 * @package: com.itheima
 * @className: App
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:14
 */
@SuppressWarnings({"all"})
public class AppForDIConstructor {
    public static void main(String[] args) {
        //获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}

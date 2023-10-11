package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;


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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao2);
        ctx.close();
    }
}

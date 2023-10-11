package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.factory
 * @className: OrderDaoFactoryBean
 * @NAME: WANG CHAO
 * @date: 2023/08/30 22:52
 */
@SuppressWarnings({"all"})
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    @Override
    public void save() {
        System.out.println("book service save...");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");

    }


}

package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.impl.BookDaoImpl;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.config
 * @className: SpringConfig
 * @NAME: WANG CHAO
 * @date: 2023/08/31 22:20
 */
@SuppressWarnings({"all"})

@Configuration
@ComponentScan("com.itheima")
//@PropertySource("jdbc.properties")
@Import(BookDaoImpl.class)
public class SpringConfig {
}

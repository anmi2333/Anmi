package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.config
 * @className: JdbcConfig
 * @NAME: WANG CHAO
 * @date: 2023/08/31 23:26
 */
@SuppressWarnings({"all"})

//@Configuration
public class JdbcConfig {
    //1.定义一个方法获得管理对象
    //2.添加@Bean
    @Bean("dataSource")
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("mt123456");
        return ds;
    }
}

package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
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

@Configuration
public class JdbcConfig {

    @Value("${jdbc.Driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    //1.定义一个方法获得管理对象
    //2.添加@Bean
    @Bean("dataSource")
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}

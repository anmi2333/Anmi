package com1.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @projectName: springmvc_demo
 * @package: com.itheima.config
 * @className: Bean
 * @NAME: WANG CHAO
 * @date: 2023/09/02 20:11
 */


@Configuration
@ComponentScan("com1.itheima.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}

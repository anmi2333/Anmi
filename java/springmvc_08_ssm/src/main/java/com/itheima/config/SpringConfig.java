package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * @projectName: springmvc_demo
 * @package: com.itheima.config
 * @className: Bean
 * @NAME: WANG CHAO
 * @date: 2023/09/02 20:11
 */
@SuppressWarnings({"all"})

@Configuration
@ComponentScan("com.itheima.service")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}

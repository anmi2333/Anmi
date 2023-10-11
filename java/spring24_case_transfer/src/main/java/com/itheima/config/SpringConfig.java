package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}

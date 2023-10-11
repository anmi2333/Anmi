package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import javax.naming.ldap.Control;

/**
 * @projectName: springmvc_demo
 * @package: com.itheima.config
 * @className: Bean
 * @NAME: WANG CHAO
 * @date: 2023/09/02 20:11
 */
@SuppressWarnings({"all"})

//@Configuration
@ComponentScan("com.itheima.controller")
public class SpringConfig {
}

package com.itheima.reggie.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.config
 * @className: MybatisPlusConfig
 * @NAME: WANG CHAO
 * @date: 2023/09/15 22:14
 */
@SuppressWarnings({"all"})
@Configuration
public class MybatisPlusConfig {

  @Bean
 public MybatisPlusInterceptor mybatisPlusInterceptor() {
  MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
  mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
  return mybatisPlusInterceptor;
 }
}

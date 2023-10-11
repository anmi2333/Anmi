package com.itheima.config;

import com.baomidou.mybatisplus.core.MybatisPlusVersion;
import com.baomidou.mybatisplus.core.override.MybatisMapperMethod;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: mybatisplus_01_quickstart
 * @package: com.itheima.config
 * @className: MpConfig
 * @NAME: WANG CHAO
 * @date: 2023/09/06 21:31
 */
@SuppressWarnings({"all"})
@Configuration
public class MpConfig {
     @Bean
     public MybatisPlusInterceptor mpInterceptor(){
         //1.定义拦截器
         MybatisPlusInterceptor mpInterceptor = new MybatisPlusInterceptor();
         //2.添加具体拦截器
         mpInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
         return mpInterceptor;
     }
}

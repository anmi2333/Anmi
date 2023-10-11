package com.itheima.Config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: itcast-mp-springboot
 * @package: cn.itcast.mp.Config
 * @className: MybatisPlusConfig
 * @NAME: WANG CHAO
 * @date: 2023/09/07 14:40
 */
@SuppressWarnings({"all"})
@Configuration
public class MPConfig {
    @Bean //配置分页插件
    public MybatisPlusInterceptor mybatisPlusInterceptor (){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}

package cn.itcast.mp.Config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan("cn.itcast.mapper")
public class MybatisPlusConfig {
    @Bean //配置分页插件
    public PaginationInterceptor paginationInterceptor (){
        return new PaginationInterceptor();
    }
}

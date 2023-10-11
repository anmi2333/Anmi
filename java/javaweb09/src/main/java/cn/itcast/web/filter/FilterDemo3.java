package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @projectName: javaweb09
 * @package: cn.itcast.web.filter
 * @className: FilterDemo1
 * @NAME: WANG CHAO
 * @date: 2023/08/18 9:55
 */
@SuppressWarnings({"all"})

//@WebFilter("/*")
public class FilterDemo3 implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * 在服务器启动,会创建Filter对象,然后调用init方法
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }
    /**
     * 在服务器关闭后,Filter对象被销毁.如果服务器是正常关闭,则执行destroy方法
     */
    public void destroy() {
        System.out.println("destroy...");
    }
}

package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb09
 * @package: cn.itcast.web.filter
 * @className: FilterDemo1
 * @NAME: WANG CHAO
 * @date: 2023/08/18 9:55
 */
@SuppressWarnings({"all"})

//@WebFilter("/*")//访问所有资源之前都会拦截
public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //System.out.println("filterDemo1被执行了...");
        //方行
        filterChain.doFilter(servletRequest,servletResponse);
        //不放行

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}

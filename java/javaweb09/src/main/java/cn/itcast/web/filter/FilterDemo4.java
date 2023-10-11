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
public class FilterDemo4 implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo4...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {

    }
}

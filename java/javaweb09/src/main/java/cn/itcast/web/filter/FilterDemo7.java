package cn.itcast.web.filter;

import javax.servlet.*;
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
public class FilterDemo7 implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo7执行了...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filterDemo7回来了...");
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {

    }
}

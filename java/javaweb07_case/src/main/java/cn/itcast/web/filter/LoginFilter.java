package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @projectName: javaweb07_case
 * @package: cn.itcast.web.filter
 * @className: LoginFilter
 * @NAME: WANG CHAO
 * @date: 2023/08/18 11:48
 */
@SuppressWarnings({"all"})

@WebFilter("/*")
public class LoginFilter implements Filter{

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(servletRequest);
        //0.强制转换
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //1.获取请求
        String uri = request.getRequestURI();
        //判断是否包含登录相关资源路径,注意要排除掉css/js/图片/验证码等资源
        if (uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/") || uri.contains("/fonts/") || uri.contains("/checkCodeServlet/")) {
            //包含用户想登录放行
            filterChain.doFilter(servletRequest,servletResponse);
        } else {
            //不包含 验证用户是否登录
            //3.从获取session中获取user
            request.setAttribute("login_msg","您尚未登录请登录");
            request.getRequestDispatcher("login.jsp").forward(request,servletResponse);
        }

        //filterChain.doFilter(servletRequest,servletResponse);
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {

    }

}

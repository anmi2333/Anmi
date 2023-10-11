package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @projectName: javaweb03
 * @package: com.example.servlet
 * @className: SerlvetDemo01
 * @NAME: WANG CHAO
 * @date: 2023/08/15 11:54
 */
@SuppressWarnings({"all"})
@WebServlet(urlPatterns = "/demo1")
public class SerlvetDemo01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    //提供服务方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet 23333");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

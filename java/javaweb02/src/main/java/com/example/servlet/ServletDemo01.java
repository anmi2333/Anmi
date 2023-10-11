package com.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

/**
 * @projectName: javaweb02
 * @package: com.example.servlet
 * @className: ServletDemo01
 * @NAME: WANG CHAO
 * @date: 2023/08/11 17:44
 */
@SuppressWarnings({"all"})

@WebServlet(urlPatterns = "/demo1")
public class ServletDemo01 implements Servlet {

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

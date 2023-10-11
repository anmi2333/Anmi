package com.example.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @projectName: javaweb02
 * @package: com.example.request
 * @className: RequestDemo01
 * @NAME: WANG CHAO
 * @date: 2023/08/15 10:01
 */
@SuppressWarnings({"all"})
@WebServlet("/requestDemo1")
public class RequestDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 获取请求方式 Get
        String method = req.getMethod();
        System.out.println(method);
        //2 获取虚拟目录 /day14
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //3 获取Servlet路径：/requestDemo1
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        //4 获取get方式请求参数: name=zhangsan
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //5 获取请求方法url：/day14/demo1
        String requestURI = req.getRequestURI(); //day14/requestDemo1
        StringBuffer requestURL = req.getRequestURL(); //http://localhost/day14/requestDemo1
        System.out.println(requestURI);
        System.out.println(requestURL);
        //6 获取协议以及版本: HTTP/1.1
        String protocol = req.getProtocol();
        System.out.println(protocol);
        //7 获取客户机的IP地址:
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}

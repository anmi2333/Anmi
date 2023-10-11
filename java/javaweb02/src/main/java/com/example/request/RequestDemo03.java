package com.example.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * @projectName: javaweb02
 * @package: com.example.request
 * @className: RequestDemo02
 * @NAME: WANG CHAO
 * @date: 2023/08/15 10:25
 */
@SuppressWarnings({"all"})
@WebServlet("/requestDemo3")
public class RequestDemo03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //演示获取请求头数据
        String agent = req.getHeader("user-agent");
        //判断agent的浏览器版本
        if (agent.contains("Chrome")) {
            System.out.println("谷歌");
        } else if (agent.contains("Firefox")) {
            System.out.println("火狐");
        }


        //1.获取所有请求头名称
        Enumeration<String> headerNames = req.getHeaderNames();
        //2.遍历
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            //根据名称获得请求头的值
            String value = req.getHeader(name);
            System.out.println(name + "---" + value);
        }
    }
}

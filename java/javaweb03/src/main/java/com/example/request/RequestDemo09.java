package com.example.request;

import com.example.servlet.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb03
 * @package: com.example.request
 * @className: RequestDemo06
 * @NAME: WANG CHAO
 * @date: 2023/08/15 14:24
 */
@SuppressWarnings({"all"})
@WebServlet("/requestDemo09")
public class RequestDemo09 extends HelloServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo9999被访问了......");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //get获取请求参数

        //根据参数名称获取参数值
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
        try {
            this.doPost(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}

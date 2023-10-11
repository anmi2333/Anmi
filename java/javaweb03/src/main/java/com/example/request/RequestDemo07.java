package com.example.request;

import com.example.servlet.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: javaweb03
 * @package: com.example.request
 * @className: RequestDemo06
 * @NAME: WANG CHAO
 * @date: 2023/08/15 14:24
 */
@SuppressWarnings({"all"})
@WebServlet("/requestDemo07")
public class RequestDemo07 extends HelloServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        post获取请求参数 post方式会中文乱码
//        0.设置流的编码
        req.setCharacterEncoding("UTF-8");
//        1 根据参数名称获取参数值
        String username = req.getParameter("username");//获取用户账户密码之类的参数值
        String password = req.getParameter("password");
        System.out.println("post");
        System.out.println(username);
        System.out.println(password);
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

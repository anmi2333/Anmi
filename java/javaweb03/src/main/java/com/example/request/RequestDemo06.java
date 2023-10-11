package com.example.request;

import com.example.servlet.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
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
@WebServlet("/requestDemo06")
public class RequestDemo06 extends HelloServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post获取请求参数
        //1 根据参数名称获取参数值
        //String username = req.getParameter("username");//获取用户账户密码之类的参数值
        //String password = req.getParameter("password");
        //System.out.println("post");
        //System.out.println(username);
        //System.out.println(password);
        //2 根据参数名称获取参数值的数组
        //String[] hobbies = req.getParameterValues("hobby");//获取用户勾选信息的数组
        //for (String hobby : hobbies) {//迭代器打印数组
        //    System.out.println(hobby);
        //}
        //3 获取所有请求参数的名称
//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()) {
//            String name = parameterNames.nextElement();
//            System.out.println(name);
//            String value = req.getParameter(name);
//            System.out.println(value);
//            System.out.println("----------------------");
//        }
        //4 获取所有参数的map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        //遍历
        Set<String> keySet = parameterMap.keySet();
        for (String key : keySet) {
        //根据key来获取值
            String[] values = parameterMap.get(key);
            System.out.println(key);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("----------------");
        }
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

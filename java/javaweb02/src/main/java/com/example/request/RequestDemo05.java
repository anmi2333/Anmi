package com.example.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @projectName: javaweb02
 * @package: com.example.request
 * @className: RequestDemo05
 * @NAME: WANG CHAO
 * @date: 2023/08/15 11:14
 */
@SuppressWarnings({"all"})
@WebServlet("/requestDemo05")
public class RequestDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求消息体
        //1 获取字符流
        BufferedReader br = req.getReader();
        //2 读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}

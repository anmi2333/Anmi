package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb05
 * @package: cn.itcast.web.servlet
 * @className: ResponseDemo1
 * @NAME: WANG CHAO
 * @date: 2023/08/15 22:45
 */
@SuppressWarnings({"all"})

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo1被访问了");

        //访问/responseDemo1,会自动跳转到/responseDemo2资源
        //1. 设置状态码为302
//        resp.setStatus(302);
        //2. 设置响应头location
//        resp.setHeader("location","/responseDemo2");
        req.setAttribute("msg","response");
        //3. 动态获得虚拟目录
        String contextPath = req.getContextPath();
        //4. 简单的重定向方法
        resp.sendRedirect("https://www.bilibili.com/");
        resp.sendRedirect(contextPath + "/responseDemo2");

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}

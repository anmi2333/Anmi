package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb09
 * @package: cn.itcast.web.servlet
 * @className: SetvletDemo0
 * @NAME: WANG CHAO
 * @date: 2023/08/18 10:39
 */
@SuppressWarnings({"all"})

//@WebServlet("/")
public class SetvletDemo0 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}

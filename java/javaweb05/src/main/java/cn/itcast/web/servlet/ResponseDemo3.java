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
 * @className: ResponseDemo3
 * @NAME: WANG CHAO
 * @date: 2023/08/15 23:22
 */
@SuppressWarnings({"all"})
@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  req.getRequestDispatcher("/responseDemo2").forward(req,resp);
 }

 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  this.doPost(req,resp);
 }
}
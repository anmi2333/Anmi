package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb12
 * @package: cn.itcast.web.servlet
 * @className: AjaxServlet
 * @NAME: WANG CHAO
 * @date: 2023/08/19 17:23
 */
@SuppressWarnings({"all"})

@WebServlet("/ajaxServletdemo")
public class AjaxServletDemo extends HttpServlet {
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     }

     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         this.doPost(req,resp);
     }
}

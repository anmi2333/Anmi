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

@WebServlet("/ajaxServlet")
public class AjaxServlet extends HttpServlet {
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //1.获取请求参数
      String username = req.getParameter("username");

      //处理业务逻辑 耗时
//         try {
//             Thread.sleep(5000);
//         } catch (InterruptedException e) {
//             throw new RuntimeException(e);
//         }
         //2.打印username
      System.out.println(username);
      //3.响应
      resp.getWriter().write("hello : " + username);
     }

     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         this.doPost(req,resp);
     }
}

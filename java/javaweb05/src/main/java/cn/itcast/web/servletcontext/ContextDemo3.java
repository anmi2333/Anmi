package cn.itcast.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb05
 * @package: cn.itcast.web.servletcontext
 * @className: ContextDemo1
 * @NAME: WANG CHAO
 * @date: 2023/08/16 11:26
 */
@SuppressWarnings({"all"})
@WebServlet("/constxtdemo3")
public class ContextDemo3 {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context1 = req.getServletContext();
        //获取数据
        context1.setAttribute("msg","haha");
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

}

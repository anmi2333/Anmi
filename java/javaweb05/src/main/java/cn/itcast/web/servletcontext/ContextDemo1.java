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
@WebServlet("/constxtdemo1")
public class ContextDemo1 {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ServletContext对象获取
        //1.通过reques对象获取
        ServletContext context1 = req.getServletContext();
        //2.通过httpservlet获取
        //ServletContext context2 = this.getServletContext();
        System.out.println(context1);
        //System.out.println(context2);
        //System.out.println(context1 == context2);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

}

package cn.itcast.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @projectName: javaweb06
 * @package: cn.itcast.cookie
 * @className: CookieDemo0
 * @NAME: WANG CHAO
 * @date: 2023/08/16 15:16
 */
@SuppressWarnings({"all"})
@WebServlet("/sessionDemo3")
public class SessionDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取session获取数据
        
        //2.获取session
        HttpSession session = req.getSession();
        System.out.println(session);

        //3.获取数据
        Cookie c = new Cookie("JSESSIONID",session.getId());
        c.setMaxAge(60*60);
        resp.addCookie(c);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}

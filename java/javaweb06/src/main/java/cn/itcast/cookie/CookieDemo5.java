package cn.itcast.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @projectName: javaweb06
 * @package: cn.itcast.cookie
 * @className: CookieDemo1
 * @NAME: WANG CHAO
 * @date: 2023/08/16 15:15
 */
@SuppressWarnings({"all"})

@WebServlet("/cookieDemo4")
public class CookieDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 创建cookie对象
        Cookie c1 = new Cookie("msg","你好");
        c1.setPath("/");
        //3 发送cookie
        resp.addCookie(c1); 
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}

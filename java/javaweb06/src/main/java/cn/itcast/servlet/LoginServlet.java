package cn.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @projectName: javaweb06
 * @package: cn.itcast.cookie
 * @className: CookieDemo0
 * @NAME: WANG CHAO
 * @date: 2023/08/16 15:16
 */
@SuppressWarnings({"all"})
@WebServlet("/loginServet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1
        resp.setCharacterEncoding("utf-8");
        //Map<String, String[]> parameterMap = req.getParameterMap();
        //2
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        //先获取验证码
        HttpSession session = req.getSession();
        String checkCode_session = (String) session.getAttribute("checkCode_session");
        //删除验证码
        session.removeAttribute("checkCode_session");
        //3
        if (checkCode_session != null && checkCode_session.equalsIgnoreCase(checkCode)) {
            //验证正确
            if ("zhangsan".equals(username) && "123".equals(password)) {
                //登录成功
                //存储用户信息
                session.setAttribute("username",username);
                //重定向到success.jsp
                resp.sendRedirect(req.getContextPath()+"/success.jsp");

            } else {
                //登录失败
                //存储提示信息到request
                req.setAttribute("login_error","用户名或密码错误");
                //转发到登录页面
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        } else {
            //验证码不一致
            //存储提示信息到request
            req.setAttribute("cc_error","验证码错误");
            //转发到登录页面
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}

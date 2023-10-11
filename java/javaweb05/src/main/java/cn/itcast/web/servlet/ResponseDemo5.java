package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @projectName: javaweb05
 * @package: cn.itcast.web.servlet
 * @className: ResponseDemo5
 * @NAME: WANG CHAO
 * @date: 2023/08/16 10:16
 */
@SuppressWarnings({"all"})

@WebServlet("/responseDemo5")
public class ResponseDemo5 {
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  resp.setContentType("text/html;charset=utf-8");
  //1.获取字节输出流
  ServletOutputStream sos = resp.getOutputStream();
  //2.输出数据
  sos.write("hello".getBytes("utf-8"));
 }
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

 }
}

package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @projectName: javaweb05
 * @package: cn.itcast.web.servlet
 * @className: ResponseDemo4
 * @NAME: WANG CHAO
 * @date: 2023/08/16 9:48
 */
@SuppressWarnings({"all"})

@WebServlet("/responseDemo4")
public class ResponseDemo4 extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //获取流对象之前 设置流的默认编码 ISO-8859-1 设置为:GBK
  resp.setCharacterEncoding("GBK");
  //告诉浏览器 服务器发送的消息数据的编码 建议浏览器使用该编码解码
  resp.setHeader("content-type","text/html;charset=utf-8");
  //简单形式设置编码
  resp.setContentType("text/html;charset=utf-8");
  //1.获取字符输出
  PrintWriter pw = resp.getWriter();
  //2.输出数据
  pw.write("<h1>hello response<h1>");
 }

 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

 }
}


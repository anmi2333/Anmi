package com.example.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

/**
 * @projectName: javaweb02
 * @package: com.example.servlet
 * @className: SerlvetDemo02
 * @NAME: WANG CHAO
 * @date: 2023/08/13 23:40
 */
@SuppressWarnings({"all"})
@WebServlet(urlPatterns = "/demo2")
public class SerlvetDemo02 extends GenericServlet {//抽象类

 @Override
 public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
  System.out.println("Hello Servlet demo2");
 }
}

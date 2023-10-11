package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @projectName: javaweb02
 * @package: com.example.servlet
 * @className: ServletDemo04
 * @NAME: WANG CHAO
 * @date: 2023/08/13 23:51
 */
@SuppressWarnings({"all"})
//@WebServlet({"/d4","/dd4","/ddd4"})
@WebServlet("*.do")
public class ServletDemo04 extends HttpServlet {
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  super.doGet(req, resp);
  System.out.println("demo04");
  System.out.println(req);
 }
}

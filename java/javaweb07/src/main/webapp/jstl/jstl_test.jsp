<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
  ArrayList list = new ArrayList();
  list.add(new User("张三", 23,new Date()));
  list.add(new User("王五", 26,new Date()));
  list.add(new User("李四", 25,new Date()));
  request.setAttribute("list",list);
%>
<table border="1" width="500" align="center">
  <tr>
    <td>编号</td>
    <td>姓名</td>
    <td>年龄</td>
    <td>生日</td>
  </tr>
  <%--数据行--%>
  <c:forEach items="${list}" var="user" varStatus="s">
    <tr>
      <td>${s.count}</td>
      <td>${user.name}</td>
      <td>${user.age}</td>
      <td>${user.birStr}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>

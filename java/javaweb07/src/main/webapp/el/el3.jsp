<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
    <%
      User user = new User();
      user.setName("张三");
      user.setBirthday(new Date());

      request.setAttribute("u",user);

        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(user);
    %>

    <h3>el获取对象中的值</h3>
    ${requestScope.u}<br>
    <%--通过对象的属性来获取
    setter getter 方法去掉set 或get 将剩余部分首字母变成小写
    --%>
    ${requestScope.u.name}<br>
    ${requestScope.u.age}<br>
    ${requestScope.u.birthday}<br>
    ${requestScope.u.birthday.year}<br>
    ${requestScope.u.birStr}<br>

    ${list}<br>
    ${list[0]}<br>
    ${list[2].name}<br>
</body>
</html>

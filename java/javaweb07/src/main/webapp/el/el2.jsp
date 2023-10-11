<%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
    <%
      //在域中存储数据
      request.setAttribute("name","张三");
      session.setAttribute("age","23");
      session.setAttribute("name","李四");
    %>

    <h3>el获取值</h3>
    ${requestScope.name}
    ${requestScope.age}
    ${requestScope.haha}

    ${name}
    ${requestScope.name}
</body>
</html>

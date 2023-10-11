<%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/16
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1><%=request.getSession().getAttribute("user")%>,欢迎</h1>
</body>
</html>

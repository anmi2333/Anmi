<%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      pageContext.setAttribute("msg","hello");
    %>
    <%=
    pageContext.getAttribute("msg")
    %>
</body>
</html>

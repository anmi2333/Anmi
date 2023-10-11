<%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el隐式对象</title>
</head>
<body>

${pageContext.request}<br>
<h4>在jsp页面动态获得虚拟目录</h4>
${pageContext.request.contextPath}<br>

<%
  response.sendRedirect(request.getContextPath()+"");
%>

</body>
</html>

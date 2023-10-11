<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--c:if标签--%>
<%--1.属性:--%>
<%--test 必须属性 接受boolean表达式--%>
<%--如果表达式为true则显示if标签体内容 如果为false 则不显示标签体内容--%>
    <%
        ArrayList arrayList = new ArrayList();
        arrayList.add("aaa");
        request.setAttribute("list",arrayList);

        request.setAttribute("number",3);
    %>

    <c:if test="true">
        <h1>我是真...</h1>
    </c:if>
    <br>
    <c:if test="${not empty list}">
        遍历集合...
    </c:if>
</body>
</html>

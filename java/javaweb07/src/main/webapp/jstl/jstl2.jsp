<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>choose</title>
</head>
<body>
      <%--
        完成数字编号对应星期几案例
        1.域中存储数字
        2.使用choose标签取出数字 switch
        3.使用when标签做数字判断  case
        4.otherwise做一个其他情况的声明 default
      --%>

      <%
          request.setAttribute("number",3);
      %>

      <c:choose>
        <c:when test="${number == 1}">星期一</c:when>
        <c:when test="${number == 2}">星期二</c:when>
        <c:when test="${number == 3}">星期三</c:when>
        <c:when test="${number == 4}">星期四</c:when>
        <c:when test="${number == 5}">星期五</c:when>
        <c:when test="${number == 6}">星期六</c:when>
        <c:when test="${number == 7}">星期七</c:when>
        <c:otherwise>找不到结果</c:otherwise>
      </c:choose>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dreamtank121
  Date: 2023/08/17
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foreach标签</title>
</head>
<body>
      <c:forEach begin="1" end="10" var="i" step="1" varStatus="s">
          ${i} <h3>${s.index}</h3> <h4>${s.count}</h4><br>
      </c:forEach>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 
  Date: 2022/4/27
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/update" method="post">
    <input type="hidden" name="id" value="${student.id}"><br>
    <input type="text" name="username" value="${student.username}"><br>
    <input type="text" name="phone" value="${student.phone}"><br>
    <input type="text" name="address" value="${student.address}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>

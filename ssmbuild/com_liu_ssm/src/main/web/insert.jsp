<%--
  Created by IntelliJ IDEA.
  User: 
  Date: 2022/4/27
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/insert" method="post">
    请输入姓名： <input type="text" name="username"><br>
    请输入电话： <input type="text" name="phone"><br>
    请输入地址： <input type="text" name="address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>

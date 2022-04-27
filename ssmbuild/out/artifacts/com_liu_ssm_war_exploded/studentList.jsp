<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 
  Date: 2022/4/27
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    div {
        width: 650px;
        margin-top: 200px;
        margin-left: 400px;
        background-color: cornsilk;
        border-radius: 15px;
    }

    body {
        background-color: skyblue;
    }
</style>
<body>

<h1 align="center">增删改查实现案例</h1>
<div>
    <form action="/student/findLike" method="post">
        用户名：<input type="text" name="username">

        手机号码：<input type="text" name="phone">

        <input type="submit" value="查询">
    </form>
    <table border="1px">

        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>电话号码</td>
            <td>编号</td>
            <td>
                <a href="/insert.jsp">添加</a>
            </td>
        </tr>
        <c:forEach items="${studentList}" var="ll">
            <tr>
                <td>${ll.id}</td>
                <td>${ll.username}</td>
                <td>${ll.phone}</td>
                <TD>${ll.address}</TD>
                <td>
                    <a href="#" onclick="deleteOne(${ll.id})">删除</a>
                    &nbsp;
                    <a href="#" onclick="update(${ll.id})">修改</a>
                </td>

            </tr>
        </c:forEach>
    </table>
</div>

<script>
    function deleteOne(obj) {
        if (confirm("你确定要删除吗")) {
            window.location.href = "${pageContext.request.contextPath}/student/delete?id=" + obj
        }
    }

    function update(obj) {
        if (confirm("你确定要修改此条记录吗？")) {
            window.location.href = "${pageContext.request.contextPath}/student/toupdate?id=" + obj
        }
    }
</script>
</body>
</html>

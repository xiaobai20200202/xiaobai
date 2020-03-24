<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zsz
  Date: 2019/9/3
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/",method="post">

    <table align="center" border="2">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>sex</td>
            <td>password</td>
            <td>photo</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="user">
        <tr>
            <td><input type="text" name="id" value="${user.id}" /></td>
            <td> <input type="text" name="name" value="${user.name }" /></td>
            <td><input type="text" name="password" value="${user.password }"></td>
            <td><input type="text" name="sex" value="${user.sex }"></td>
            <td><input type="text" name="photo" value="${user.photo }"></td>
            <td><a href="${pageContext.request.contextPath }/queryUserById?id=${user.id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath }/delete?ids=${user.id}">删除</a></td>
        </tr>
        </c:forEach>
        <tr>
            <td><a href="${pageContext.request.contextPath }/Useradd.jsp">添加</a></td>
            <td></td>
        </tr>
    </table>

</form>
</body>
</html>

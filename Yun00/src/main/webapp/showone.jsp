<%--
  Created by IntelliJ IDEA.
  User: zsz
  Date: 2019/9/3
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showone</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/updateUser",method="post">
        <table align="center" border="2">
            <tr>
                <td>name</td>
                <input type="hidden" name="id" value="${requestScope.user.id }" />
                <td> <input type="text" name="name" value="${requestScope.user.name }" /></td>
            </tr>
            <tr>
                <td>pwd</td
                ><td><input type="text" name="password" value="${requestScope.user.password }"></td>
            </tr>
            <tr>
                <td>sex</td
                ><td><input type="text" name="sex" value="${requestScope.user.sex }"></td>
            </tr>
            <tr>
                <td>photo</td
                ><td><input type="text" name="photo" value="${requestScope.user.photo }"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"> <input type="submit" value="修改" /></td>
            </tr>

        </table>

    </form>
</body>
</html>

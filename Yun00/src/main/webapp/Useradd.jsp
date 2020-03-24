<%--
  Created by IntelliJ IDEA.
  User: zsz
  Date: 2019/9/3
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="addDiv">
    <form method="post" action="${pageContext.request.contextPath }/save">
        id：<input id="id" name="id"/><br/>
        人名：<input id="name" name="name"/><br/>
        性别：<input id="sex" name="sex"/><br/>
        密码：<input id="password" name="password"/>
        照片：<input id="photo" name="photo"/>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>

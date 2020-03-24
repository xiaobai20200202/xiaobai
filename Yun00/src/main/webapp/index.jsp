<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h2>${sessionScope.name }</h2>
<a href="${pageContext.request.contextPath }/queryUserByPage?column=name&value=a">查询所有</a>
</body>
</html>

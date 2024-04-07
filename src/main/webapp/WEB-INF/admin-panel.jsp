<%--
  Created by IntelliJ IDEA.
  User: nisch
  Date: 3/10/2024
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>From admin panel</h1>
<jsp:useBean id="beanName" class="Login" scope="page" type="Login">
    <jsp:getProperty name="beanName" property="getTest"/>
</jsp:useBean>
</body>
</html>

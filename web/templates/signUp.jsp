<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 4/24/2017
  Time: 5:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Sign Up</title>
    </head>
    <jsp:include page="menu.jsp"></jsp:include>
    <body>
        <label>Username</label>
        <input type="text" name="username"/>
        <label>Password</label>
        <input type="password" name="password"/>
        <input type="button" name="signup" value="Sign Up"/>
    </body>
</html>

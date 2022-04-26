<%--
  Created by IntelliJ IDEA.
  User: estebahnmolina
  Date: 4/26/22
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("profile.jsp");
        }else {
            response.sendRedirect("login.jsp");
        }
    }

%>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="POST">
    <label for="username">Username</label>
    <input id="username" name="username" type="text" max="60" placeholder="Username Here">
    <br><br> <label for="password">Password</label>
    <input id="password" name="password" type="text" max="60" placeholder="Enter Password">
    <br><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>

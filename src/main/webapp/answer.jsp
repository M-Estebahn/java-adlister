<%--
  Created by IntelliJ IDEA.
  User: estebahnmolina
  Date: 4/28/22
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answer</title>
</head>
<body>

<c:if test="${result}">
    <h3>You are Correct!!</h3>
</c:if>

<c:if test ="${!result}">
    <h3>You are Incorrect!!</h3>
</c:if>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: estebahnmolina
  Date: 4/28/22
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="guess" method="post">
    <input type="radio" id="num1" name="guess" value=1>
    <label for="num1">1</label><br>
    <input type="radio" id="num2" name="guess" value=2>
    <label for="num2">2</label><br>
    <input type="radio" id="num3" name="guess" value=3>
    <label for="num3">3</label><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>

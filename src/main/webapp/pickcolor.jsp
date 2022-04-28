<%--
  Created by IntelliJ IDEA.
  User: estebahnmolina
  Date: 4/27/22
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pick your Color</title>

</head>
<body>
<form method="post" action="/pickcolor">
    <label for="color">Input Your Favorite Color</label>
    <input type="text" id="color" name="color">
    <input type="submit" value="Submit Color">


</form>
</body>
</html>

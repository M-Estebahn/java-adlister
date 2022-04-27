<%--
  Created by IntelliJ IDEA.
  User: estebahnmolina
  Date: 4/27/22
  Time: 12:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form action="Post" >
    <label for="crust">Choose a Crust</label>
    <select id="crust" name="crust">
        <option value="pan">Pan</option>
        <option value="stuffed">Stuffed</option>
        <option value="thin">Thin</option>
        <option value="chicago">Chicago</option>
    </select>
    <br><br>
    <label for="sauce">Choose a Sauce</label>
    <select id="sauce" name="sauce">
        <option value="spice">Spicy Marinara</option>
        <option value="white">White</option>
        <option value="classic">Classic</option>
    </select>
    <br><br>
    <label for="size">Choose a Size</label>
    <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br><br>
    <h3>Toppings</h3>
    <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
    <label for="pepperoni"> Pepperoni</label><br>
    <input type="checkbox" id="sausage" name="sausage" value="sausage">
    <label for="sausage"> Sausage</label><br>
    <input type="checkbox" id="mushrooms" name="mushrooms" value="mushrooms">
    <label for="mushrooms"> Mushrooms</label>
    <br><br>
    <label for="address">Address</label>
    <br>
    <label for="address">Enter Address</label><input type="text" id="address" name="address">
    <br>
    <button>Order Pizza</button>
</form>
</body>
</html>

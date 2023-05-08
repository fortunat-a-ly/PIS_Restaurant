<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 29/05/2022
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<nav>
    <ul>
        <li><a href="restaurant/meals.jsp">Meals</a></li>
        <li><a href="myServlet?command=gotomain">Main</a></li>
        <li><a href="myServlet?command=gotolibrary">Library</a></li>
        <li><a href="myServlet?command=logout">Logout</a></li>
    </ul>
</nav>
<form action="<%= request.getContextPath() %>/app/registration" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="email" name="email" /></td>
        </tr>
        <tr>
            <label for="roles">Choose a role:</label><select name="roles" id="roles">
                <option value="saab">Customer</option>
                <option value="mercedes">Cook</option>
            </select>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td><input type="password" name="confirm_password" /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" />
</form>
</body>
</html>

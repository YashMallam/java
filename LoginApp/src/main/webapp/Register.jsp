<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="icon" href="images/sign.png" type="image/png"/>
</head>
<body>
<div align=center>
<h1>Sign Up</h1>
<form action="RegisterServlet" method="post">
<table>
<tr><td>UserName</td><td><input type="text" name="username"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td>Email</td><td><input type="email" name="Email"></td></tr>
<tr><td><input type="submit" value="Register"></td></tr>
</table>
</form>
</div>
<div align=center>
<a href="Login.jsp">Already have an account? </a>
</div>
</body>
</html>
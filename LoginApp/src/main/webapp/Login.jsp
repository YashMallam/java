<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="icon" href="images/sign.png" type="image/png"/>
</head>
<body>
<div align=center>
<h1>Login</h1>
</div>
<form action="LoginServlet" method="post">
<table>
<tr><td>Email</td><td><input type="email" name="Email"></td></tr>
<tr><td>Password</td><td><input type="password" name="pass"></td></tr>
<tr><td><input type="submit" value="login"></td></tr>
</table>
</form>
<table>
<tr><td><a href="ForgotPassword.jsp">Forgot Password?</a><td></tr>
<tr><td><a href="Register.jsp">Register</a><td></tr>
</table>
</body>
</html>
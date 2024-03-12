<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
    <%@ page import="userlog.LoginModel,userlog.ProductModel,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<%LoginModel lm=(LoginModel)request.getAttribute("login");
ArrayList<ProductModel> al=(ArrayList)request.getAttribute("prod");
%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Hello Welcome</p>
<%=lm.getUsername() %>
<table>
<tr>
<th>name</th>
<th>code</th>
<th>price</th>
</tr>
<%for (ProductModel p:al){ %>
<tr>
<td><%=p.getName() %></td>
<td><%=p.getCode() %></td>
<td><%=p.getPrice() %></td>
</tr>
<%} %>
</table>
<c:out value="${'Welcome to HomePage' }"></c:out>

<img alt="carimage" src="car-image.jpg">

</body>
</html>
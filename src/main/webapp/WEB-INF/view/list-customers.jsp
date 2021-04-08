<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css "/>
</head>
<body>
<h1>hemos llegado a la lista de clientes</h1>

<table>
<tr>

<th>Name</th>
<th>Lastname</th>
<th>Email</th>

</tr>

<c:forEach var="customervar" items="${customer }">

<tr>

<td>${customervar.firstname}</td>
<td>${customervar.lastname}</td>
<td>${customervar.email}</td>

</tr>



</c:forEach>

</table>
<br>
<input  type="button" value= "Add Customer" onclick="window.location.href='showFormAddCustomer'; return false;"/>
</body>
</html>
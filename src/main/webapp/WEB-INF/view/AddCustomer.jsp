<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css "/>
</head>
<body>
<h1>Add Customer</h1>
<form:form action="InsertCustomer" modelAttribute="customer" method="GET" >
	
	<table>
	
		<tr>
			<td>Email</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td>Firstname</td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td>Lastname</td>
			<td><form:input path="lastname" /></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><form:input path="phonenumber" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="address" /></td>
		</tr>
		<tr>
			<td>City</td>
			<td><form:input path="city" /></td>
		</tr>
		<tr>
			<td>Post Code</td>
			<td><form:input path="postcode" /></td>
		</tr>
		<tr>
			<td>Country</td>
			<td><form:input path="country" /></td>
		</tr>
		<tr>
			<td colspan ="2"><input type="submit" value="Insert"/></td>
		</tr>
	
	</table>

</form:form>


</body>
</html>
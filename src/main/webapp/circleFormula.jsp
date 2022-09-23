<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Circle Calculator</title>
</head>
<body>
	<h1>Circle Formula</h1>
	<h3>Formula: ${userShape.getAreaFormula()}</h3><br />
	<form action="getAreaServlet" method="post">
		<input type="hidden" name="user_shape" value="circle"> 
		<label for= "radius">Please enter the radius</label><br>
		<input type="text" id= "radius" name="user_radius">
		<br><br>
 	<input type="submit" value= "Submit"/>
	</form>
	
	<a href="index.jsp">Select another shape</a>
</body>
</html>
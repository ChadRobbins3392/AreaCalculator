<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Square Calculator</title>
</head>
<body>
	<h1>Square Formula</h1>
	<h3>Formula: ${userShape.getAreaFormula()}</h3><br />
	
	<form action="getAreaServlet" method="post">
		<input type="hidden" name="user_shape" value="square"> 
		<label for= "length">Please enter the length</label>
		<input type="text" id= "length" name="user_length"><br>
		<label for= "width">Please enter the width</label>
		<input type="text" id= "width" name="user_width"><br>
		<br><br>
	 	<input type="submit" value= "Submit"/>
	</form>
	
	<a href="index.jsp">Select another shape</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area Calculator</title>
</head>
<body>
	<h1>Area Calculator</h1>
 	<h3>Enter the shape below to get the formula to calculate the Area.</h3>
 	
 	<form action="getShapeServlet" method="post">
 		<input type="radio" id= "circle" name="user_shape" value="circle">
 		<label for= "circle">Circle</label><br>
 		<input type="radio" id="square" name="user_shape" value="square">
 		<label for="square">Square</label><br>
 		<input type="radio" id="triangle" name="user_shape" value="triangle">
 		<label for="triangle">Triangle</label>
 		<br><br>
 		<input type="submit" value= "Submit"/>
 	</form>
</body>
</html>
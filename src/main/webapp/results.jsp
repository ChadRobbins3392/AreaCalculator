<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area Results</title>
</head>
<body>
	<h1>Results</h1>
	<p> Area: ${userArea.getArea()} </p> <br />
	<a href="index.jsp">Select another shape</a>
</body>
</html>
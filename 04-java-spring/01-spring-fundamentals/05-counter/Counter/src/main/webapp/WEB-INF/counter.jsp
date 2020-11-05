<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>

<h2>You have visited <a href="/">Welcome Page</a> <c:out value="${count}"/> times. </h2>
<br>
<h1><a href="/">Test another visit?</a></h1>

</body>
</html>
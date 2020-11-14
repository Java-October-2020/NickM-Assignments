<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/languages">Dash-board</a>
<br>
	<p>Name: <c:out value="${language.name}"/></p>
	<p>Creator: <c:out value="${language.creator}"/></p>
	<p>Version: <c:out value="${language.version}"/></p>

<br>
<a href="/language/edit/${language.id}">Edit</a>
<br>
<a href="/language/delete/${language.id}">Delete</a>


</body>
</html>
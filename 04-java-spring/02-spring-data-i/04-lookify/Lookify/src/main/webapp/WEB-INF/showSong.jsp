<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Songs by <c:out value="${song.artist}"/></title>
</head>
<body>
<a href="/dashboard">Dash-board</a>
<br>
	<p>Title: <c:out value="${song.title}"/></p>
	<p>Artist: <c:out value="${song.artist}"/></p>
	<p>rating(1-10): <c:out value="${song.rating}"/></p>

<br>
<a href="/song/delete/${song.id}">Delete</a>

</body>
</html>
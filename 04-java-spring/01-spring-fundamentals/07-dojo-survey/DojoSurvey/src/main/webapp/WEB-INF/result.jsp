<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>

<h1>Submitted Info</h1>
	<p>Name: ${ submittedName}</p>
	<p>Dojo Location: ${ submittedLocation }</p>
	<p>Favorite Language: ${ submittedLanguage}</p>
	<p>Comment: ${ Comment }</p>

</body>
</html>
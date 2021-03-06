<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<a href="/language/delete/${language.id}">Delete </a>   <a href="/languages">Dash-board</a>

<div class="form-group">
	<form:form action="/language/edit/${language.id}" method="POST" modelAttribute="language">
	    <p>
	        <form:label path="name">Name
	        <form:errors path="name"/>
	        <form:input path="name"/></form:label>
	    </p>
	    <p>
	        <form:label path="creator">Creator
	        <form:errors path="creator"/>
	        <form:input path="creator"/></form:label>
	    </p>
	    <p>
	        <form:label path="version">Version
	        <form:errors path="version"/>
	        <form:input path="version"/></form:label>
	    </p> 
	    <input type="submit" value="Submit"/>
	</form:form>    
</div>

</body>
</html>
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
<h1>New Dojo</h1>
<form:form action="/dojos/new" method="POST" modelAttribute="dojo">
	<div class="form-group">	
		<form:label path="name">Name:</form:label>
		<form:errors path="name"/>
		<form:input class="form-control" path="name"/>
	</div>
	<p>
	<input type="submit" value="New Dojo"/>
	</p>
</form:form>

</body>
</html>
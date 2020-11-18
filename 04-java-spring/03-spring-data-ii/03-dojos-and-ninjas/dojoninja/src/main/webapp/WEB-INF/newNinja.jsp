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
<h1>New Ninja</h1>
<div class="form-group">
	<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
		<P>
			<form:label path="dojo">Dojo:</form:label>
		    <form:errors path="dojo"/>
		    <form:select class="form-control" path="dojo">
		    <c:forEach items="${ dojos }" var="d">
		    <form:option value="${ d.id }">${ d.name } </form:option>
		    </c:forEach>
		    </form:select>
		</P>
	    <p>
	        <form:label path="firstName">First Name:</form:label>
	        <form:errors path="firstName"/>
	        <form:input path="firstName"/>
	    </p>
	    <p>
	        <form:label path="lastName">Last Name:</form:label>
	        <form:errors path="lastName"/>
	        <form:input path="lastName"/>
	    </p>
	    <p>
	        <form:label path="age">Age:</form:label>
	        <form:errors path="age"/>
	        <form:input path="age"/>
	    </p> 
	    <input type="submit" value="Create"/>
	</form:form>    
</div>
</body>
</html>
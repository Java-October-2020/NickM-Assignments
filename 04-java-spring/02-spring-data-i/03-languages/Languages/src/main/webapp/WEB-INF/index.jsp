<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coding Languages</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<div class="wrapper">
<div class="langtable">
	<table class="table table-dark">
	    <thead>
	        <tr>
	            <th>Name</th>
	            <th>Creator</th>
	            <th>Version</th>
	            <th>Action</th>
	        </tr>
	    </thead>
	    <tbody>
			<c:forEach items="${allLanguages}" var="language" varStatus="loop">
			<tr>    
	   			 <td><a href="language/${language.id}"><c:out value="${language.name}"/></a></td>
	   			 <td><c:out value="${language.creator}"/></td>
	   			 <td><c:out value="${language.version}"/></td>
	   			 <td><a href="/language/delete/${language.id}">Delete </a>   <a href="/language/edit/${language.id}">Edit</a></td>
			</tr>
			</c:forEach>
	    </tbody>
	
	</table>
</div>
<div class="form-group">
	<form:form action="/languages" method="POST" modelAttribute="language">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator</form:label>
	        <form:errors path="creator"/>
	        <form:input path="creator"/>
	    </p>
	    <p>
	        <form:label path="version">Version</form:label>
	        <form:errors path="version"/>
	        <form:input path="version"/>
	    </p> 
	    <input type="submit" value="Submit"/>
	</form:form>    
</div>

</div>

</body>
</html>
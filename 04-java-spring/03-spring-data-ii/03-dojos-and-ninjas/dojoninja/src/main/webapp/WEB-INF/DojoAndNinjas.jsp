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
<h1> ${dojo.name}</h1>

<div class="ninjaTable">
	<table class="table table-dark">
	    <thead>
	        <tr>
	            <th>First Name</th>
	            <th>Last Name</th>
	            <th>Age</th>
	        </tr>
	    </thead>
	    <tbody>
			<c:forEach items="${ dojo.ninjas}" var="nin" varStatus="loop">
			<tr>    
	   			 <td><c:out value="${nin.firstName}"/></td>
	   			 <td><c:out value="${nin.lastName}"/></td>
	   			 <td><c:out value="${nin.age}"/></td>
			</tr>
			</c:forEach>
	    </tbody>
	
	</table>
</div>
</body>
</html>
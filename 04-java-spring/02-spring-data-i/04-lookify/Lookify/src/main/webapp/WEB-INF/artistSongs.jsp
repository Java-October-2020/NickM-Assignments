<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Songs by <c:out value="${song.artist}"/></title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h1>Songs by: <c:out value="${artist}"/></h1>

<nav>
	<form action="/search/songs" class="float-right">
		<input type="text" name="artist" placeholder="search..."/>
		<button class="btn btn-primary">Search Artists</button>
	</form>
</nav>
<a href="/dashboard">Dashboard</a>
<table class="table table-dark">
	<thead>
		<tr>
			<th>Name</th>
			<th>Song</th>
			<th>Rating</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${songsByArtist}" var="song">
		<tr>	
			<td><c:out value="${song.artist}"/></td>
			<td><c:out value="${song.title}"/></td>
			<td><c:out value="${song.rating}"/></td>
			<td><a href="/song/delete/${song.id}">Delete</a>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
</head>
<body>

<form method="POST" action="/result">
	<label for="name">Name: </label>
			<input type="text" placeholder="Name Here" name="name"></input>
	<br>
	<label>Dojo Location:</label>
			<select name="dojoLocation">
				<option value="SanJose">San Jose</option>
				<option value="NewYork">NewYork</option>
				<option value="Miami">Miami</option>	
			</select>
	<br>
	<label>Favorite Language</label>
			<select name="favoriteLanguage">
				<option value="Python">Python</option>
				<option value="Java">Java</option>
				<option value="C#">C#</option>	
			</select>
	<br>
	<label>Comment (optional):</label>
	<br>
		<textarea name="Comment" placeholder="something nice"></textarea>
	<br>
	<button>Submit</button>
</form>

</body>
</html>
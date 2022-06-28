<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>I'm a Template</h1>
	
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Genre</th>
				<th>Release Date</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="movie" items="${movies}">
				<tr>
					<td><a href="/movie/show/${movie.id}">${movie.title}</a></td>
					<td>${movie.genre}</td>
					<td>${movie.release_date}</td>
					<td>${movie.rating}</td>
					<td>
						<a href="/movie/edit/${movie.id}">Edit</a>
						<form class="flex gap2" action="/movie/delete/${movie.id}" method="POST">
							<input type="submit" value="Delete" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form class="grid" action="/movie" method="POST" modelAttribute="movie">
		<form:input placeholder="Title" path="title"></form:input>
		<form:errors class="col_red" path="title"></form:errors>

		<form:errors class="col_red" path="genre"></form:errors>
		<form:input placeholder="Genre" path="genre"></form:input>		

		<form:errors class="col_red" path="release_date"></form:errors>
		<form:input placeholder="Release Date" type="number" path="release_date"></form:input>		

		<form:errors class="col_red" path="rating"></form:errors>
		<form:input placeholder="Rating" type="number" path="rating"></form:input>				

		<input type="submit" value="Create Movie!" />
	</form:form>
</body>
</html>
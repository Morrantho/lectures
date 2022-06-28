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

	<form:form class="grid" action="/movie/edit/${movie.id}" method="POST" modelAttribute="movie">
		<form:input placeholder="Title" path="title"></form:input>
		<form:errors class="col_red" path="title"></form:errors>

		<form:errors class="col_red" path="genre"></form:errors>
		<form:input placeholder="Genre" path="genre"></form:input>		

		<form:errors class="col_red" path="release_date"></form:errors>
		<form:input placeholder="Release Date" type="number" path="release_date"></form:input>		

		<form:errors class="col_red" path="rating"></form:errors>
		<form:input placeholder="Rating" type="number" path="rating"></form:input>				

		<input type="submit" value="Edit Movie" />
	</form:form>

</body>
</html>
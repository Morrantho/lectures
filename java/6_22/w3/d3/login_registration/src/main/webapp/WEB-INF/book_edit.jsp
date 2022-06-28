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
	<h1>Book Edit</h1>
	
	<form:form action="/books/${book.id}/edit" method="POST" modelAttribute="book">
		<form:errors path="title"></form:errors>
		<form:input path="title" placeholder="Title"></form:input>

		<form:errors path="author"></form:errors>
		<form:input path="author" placeholder="Author"></form:input>

		<form:errors path="description"></form:errors>
		<form:input path="description" placeholder="Description"></form:input>

		<form:errors path="user"></form:errors>
		<form:input value="${user.id}" type="hidden" path="user"></form:input>

		<input type="submit" value="Edit Book" />
	</form:form>	
</body>
</html>
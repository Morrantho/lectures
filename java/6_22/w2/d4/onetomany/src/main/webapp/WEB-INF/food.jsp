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
	
	<form:form action="/food/new" method="POST" modelAttribute="food">
		<form:errors path="name"></form:errors>
		<form:input path="name" placeholder="Name"></form:input>

		<form:errors path="rating"></form:errors>
		<form:input type="number" path="rating" placeholder="Rating"></form:input>

		<form:select path="user" >
			<c:forEach var="user" items="${users}">
				<form:option value="${user.id}" >${user.id} - ${user.name}</form:option>
			</c:forEach>
		</form:select>

		<input value="Create Food" type="submit" />
	</form:form>
</body>
</html>
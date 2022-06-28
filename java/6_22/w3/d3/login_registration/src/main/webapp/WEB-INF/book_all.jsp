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
	<h1>Book All</h1>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Author</th>
				<th>Posted By</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="book" items="${books}" >
				<tr>
					<td>${book.id}</td>
					<td>${book.title}</td>
					<td>${book.author}</td>
					<td>${book.user.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
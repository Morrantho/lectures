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
	<h1>Madlibs</h1>
	
	<form action="/submit" method="POST" >
		<div>
			<input type="text" name="noun" placeholder="Noun" />
		</div>
		<div>
			<input type="text" name="adjective" placeholder="Adjective" />	
		</div>
		<div>
			<input type="text" name="verb" placeholder="Verb" />	
		</div>
		
		<input type="Submit" value="Create Madlib" />
	</form>
</body>
</html>
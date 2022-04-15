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
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
	<div class="grid bg_blue">
		<div class="container grid p2 col2">
			<div></div>
			<div class="grid col2 gap2">
				<a class="col_white1" href="/login">Login</a>
				<a class="col_white1" href="/register">Register</a>
			</div>
		</div>
	</div>

	<div class="container p2 grid gap2">
		<div class="card">
			<div class="card_head grid col2 align_center justify_center">
				<h1 class="col_white1">${song.artist.name}</h1>
				<p class="col_white1">${song.artist.nationality}</p>
			</div>
			
			<div class="card_body">
				<p>Song Title: ${song.song_title}</p>			
				<p>Song Genre: ${song.genre}</p>
				<a href="/song">Back</a>
			</div>
		</div>
	</div>
</body>
</html>
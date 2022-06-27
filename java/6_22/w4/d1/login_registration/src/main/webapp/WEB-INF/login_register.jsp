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
</head>
<body>
	<h1>Welcome!</h1>
	
	<h1>Register</h1>

	<script>
		onregister=(e)=>
		{
			e.preventDefault();
			let avatar=document.getElementById("avatar");
			let file=avatar.files[0];
			let reader=new FileReader();
			reader.readAsDataURL(file);
			
			let user=
			{
				name:document.getElementById("name").value,
				email:document.getElementById("email").value,
				avatar:document.getElementById("avatar").value,
				password:document.getElementById("password").value,
				confirm:document.getElementById("confirm").value
			};
			
			reader.onload=(resolve,reject)=>
			{
				user.avatar=reader.result;

				fetch("http://localhost:8080/api/register",
				{
					method:"POST",
					body:JSON.stringify( user ),
				    headers:
				    {
				        'Content-Type': 'application/json'
			      	},					
				});
				
				//resolve(reader.result);
	        };

	        //reader.onerror=(error)=>reject(error);
		}
	</script>

	<form
		onsubmit="onregister(event)"
		class="grid"
	>
		<div>
			<input id="avatar" type="file"/>
		</div>

		<div>
			<input id="name" placeholder="Username" />		
		</div>

		<div>
			<input id="email" placeholder="Email" />		
		</div>

		<div>
			<input id="password" type="password" placeholder="Password" />		
		</div>

		<div>
			<input id="confirm" type="password" placeholder="Password Confirmation" />		
		</div>
		
		<input type="submit" value="Register"/>		
	</form>


	<form:form action="/api/register" method="POST" modelAttribute="user">
		<form:input path="avatar" type="file" onchange="" ></form:input>

		<input type="submit" />
	</form:form>

	<h1>Login</h1>

	<form:form class="grid" action="/login" method="POST" modelAttribute="userLogin">
		<div>
			<form:errors path="email"></form:errors>
			<form:input placeholder="Email" path="email"></form:input>
		
		</div>
		
		<div>
			<form:errors path="password"></form:errors>
			<form:input type="password" placeholder="Password" path="password"></form:input>		
		</div>
		
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>
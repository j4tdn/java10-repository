<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign In Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" >
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet"/>
	
	<style>
		.center {
			text-align: center;
			color: blue;
			font-family: Corbel;
		}
		.red {
			color: red;
		}
	</style>
</head>
<body>
	<div class="container">
		
		<!-- The server understood the request but refuses to authorize it. -->
		<form:form class="form-signin" method="post" action="/10-spring-security-demo/signin">
			<c:if test="${param.error != null}">
				<p class="center red"> Bad Credentials </p>
			</c:if>
			
			<h2 class="form-signin-heading center">Login Page</h2>
			<p>
				<label for="username" class="sr-only">Username</label> 
				<input
					type="text" id="username" name="username" class="form-control"
					placeholder="Username" required autofocus>
			</p>
			<p>
				<label for="password" class="sr-only">Password</label> <input
					type="password" id="password" name="password" class="form-control"
					placeholder="Password" required>
			</p>
			<button class="btn btn-lg btn-dark btn-block" type="submit">
				Sign in
			</button>
		</form:form>
		</div>
</body>
</html>
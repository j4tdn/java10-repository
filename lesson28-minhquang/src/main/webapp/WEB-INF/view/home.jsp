<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>Spring Home Page</title>
</head>

<body>
	<h2>Spring Home Page</h2>
	<hr>
	
	<p>
	Welcome to Spring Home Page
	</p>
	<p>
	I wish You all the best
	</p>
	
	<br><br>
	
	<p>
		Visit our great customer <a href="${contextPath}/index">page</a>
	</p>
	
	<hr>
	
	<p>
		User: <sec:authentication property="principal.username" />
		<br><br>
		<br><br>
		Role(s): <sec:authentication property="principal.authorities" />
		FirstName: ${user.firstName}, LastName: ${user.lastName}"
	</p>
	

	<sec:authorize access="hasRole('MANAGER')">
	
		<p>
			<a href="${contextPath}/leaders">Leadership Meeting</a>
			(Only for Manager)
		</p>

	</sec:authorize>	
	
	<sec:authorize access="hasRole('ADMIN')">  

		<p>
			<a href="${contextPath}/systems">IT Systems Meeting</a>
			(Only for Admin)
		</p>
	
	</sec:authorize>
	
	<hr>

	
	<!-- Add a logout button -->
	<form:form action="${contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" />
		
	</form:form>
	
</body>

</html>










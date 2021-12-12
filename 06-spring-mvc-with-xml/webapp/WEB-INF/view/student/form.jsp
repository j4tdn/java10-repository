<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Sign up - Page</title>
</head>
<body>
	
	<h3>Student Sign up Page</h3>
	
	<hr> <br>

	<form:form modelAttribute="student" action="${pageContext.request.contextPath}/student/processForm" method="post">
		
		<form:input path="fullname" placeholder="What's your name"/>
		
		<br> <br>
		
		<form:input path="age" placeholder="How old are your"/>
		
		<br> <br>
		
		<input type="submit" value="Register">
	</form:form>
</body>
</html>
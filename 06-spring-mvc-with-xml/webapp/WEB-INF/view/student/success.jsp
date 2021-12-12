<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Student Success - Page</title>
	<style>
		.green {
			color: green;
		} 
		
		.red {
			color: red;
		} 
	</style>
</head>
<body>

	<h3 class="green">Student Success Page</h3>
	
	<h3 class="green">Congratulations. You have registered our course successful !</h3>
	
	<hr>
	
	<p class="red">Your information </p>
	
	<p> Name: ${student.fullname} </p>
	<p> Age: ${student.age} </p> 


</body>
</html>
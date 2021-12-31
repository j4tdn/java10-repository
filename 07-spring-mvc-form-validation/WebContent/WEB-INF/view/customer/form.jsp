<%@ include file="/WEB-INF/taglib/import.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Sign up - Page</title>

<link href="${contextPath}/resources/css/style.css" rel="stylesheet"/>

</head>
<body>
	<h4 class='title'>Customer Sign up Page</h4>

	<hr> <!-- thymeleaf || JS Fw -->

	<form:form modelAttribute="customer"
		action="${contextPath}/customer/processForm" method="post">

		<div>
			<label>First Name:</label> <br>
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
		</div>

		<div>
			<label>Last Name:</label> <br>
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</div>
		
		<div>
			<label>Free Passes:</label> <br>
			<form:input path="freePasses" type="number"/>
			<form:errors path="freePasses" cssClass="error" />
		</div>
		
		<div>
			<label>Postal Code:</label> <br>
			<form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
		</div>
		
		<div>
			<label>Course Code:</label> <br>
			<form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error" />
		</div>

		<input type="submit" value="Submit">
	</form:form>
</body>
</html>
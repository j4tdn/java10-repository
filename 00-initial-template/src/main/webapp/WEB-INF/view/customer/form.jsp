<%@ include file="/WEB-INF/taglib/import.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer - Form</title>

<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css" />
	  
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/customers-style.css" />

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Customer</h3>
		<form:form>
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>
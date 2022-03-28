<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>List Customers</title>
	<link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			

			<c:if test="${contextPath.userPrincipal.authorities == 'MANAGER'}">
				<!-- put new button: Add Customer -->
				<input type="button" value="Add Customer"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
				/>
			</c:if>

			<form action="search">
			<div>
			<input type="text" name="param" value="${searchValue}">
			<input type="submit" value="Search"
				   class="add-button"
			/>
			</div> 
			</form>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<c:if test="${contextPath.userPrincipal.authorities == 'MANAGER'}">
						<th>Action</th>
					</c:if>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>					
					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>					
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<c:if test="${contextPath.userPrincipal.authorities == 'MANAGER'}">
							<td>
								<!-- display the update link --> 
								<a href="${updateLink}">Update</a> | <c:if
									test="${contextPath.userPrincipal.authorities == 'ADMIN'}">
									<a href="${deleteLink}"
										onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
								</c:if>
							</td>
						</c:if>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>










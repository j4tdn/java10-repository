<%@ include file="/WEB-INF/taglib/import.jsp"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Management Application</title>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
	rel="stylesheet">

</head>
<body>
	<header>
		<nav class="navbar navbar-light bg-light navbar-expand-lg">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerId" aria-controls="#navbarTogglerId" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
				<a class="navbar-brand" href="${contextPath}/">
					<svg xmlns="http://www.w3.org/2000/svg" width="42" height="32" fill="currentColor" class="bi bi-person-badge" viewBox="0 0 16 16">
					  <path d="M6.5 2a.5.5 0 0 0 0 1h3a.5.5 0 0 0 0-1h-3zM11 8a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
					  <path d="M4.5 0A2.5 2.5 0 0 0 2 2.5V14a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2.5A2.5 2.5 0 0 0 11.5 0h-7zM3 2.5A1.5 1.5 0 0 1 4.5 1h7A1.5 1.5 0 0 1 13 2.5v10.795a4.2 4.2 0 0 0-.776-.492C11.392 12.387 10.063 12 8 12s-3.392.387-4.224.803a4.2 4.2 0 0 0-.776.492V2.5z"/>
					</svg>	
				</a>
				<div class="collapse navbar-collapse" id="#navbarTogglerId">

					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item">
							<a class="nav-link customer-page" aria-current="page" href="${contextPath}/customer">Customer</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#">Stuff</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#" tabindex="-1" aria-disabled="true">Admin</a>
						</li>
					</ul>

					<form:form action="${contextPath}/customer" method="GET" class="d-flex">
						<input type="hidden" name="page" value="${param.page}">
						<input name="text" value="${fn:trim(param.text)}"
							class="form-control me-2" type="search" placeholder="Search"
							aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form:form>
				</div>
			</div>
		</nav>
	</header>


	<main class="container-fluid">
	<p><%=request.getAttribute("javax.servlet.forward.request_uri")%></p>
		<a href="${contextPath}/customer/add"
			class="btn btn-primary btn-sm mt-3 mb-3"> <i
			class="far fa-address-book"></i> Add Customer
		</a>
		
		<c:set var="currentPage" value="${param.page}" />
		<c:if test="${empty currentPage}">
		    <c:set var="currentPage" value="1" />
		</c:if>
		
		<table class="table table-bordered table-striped">
			<thead class="table-dark">
				<tr>
					<th><a href="${contextPath}/customer?page=${currentPage}&sort=first_name">First name</a></th>
					<th><a href="${contextPath}/customer?page=${currentPage}&sort=last_name">Last name</a></th>
					<th><a href="${contextPath}/customer?page=${currentPage}&sort=email">Email</a></th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="customer" items="${customers}">
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td>
							<a href="${contextPath}/customer/update?id=${customer.id}" class="btn btn-info btn-sm">Update</a> 
							<a href="${contextPath}/customer/delete?id=${customer.id}" class="btn btn-danger btn-sm"
							   onclick="if(!confirm('Are you sure you want to delete this customer ?')) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<nav class="float-end">
			<ul class="pagination">
				<c:if test="${currentPage!=1}">
					<li class="page-item"><a
						href="${contextPath}/customer?page=${currentPage-1}"
						aria-label="Previous" class="page-link"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
				</c:if>


				<c:forEach var="page" begin="1" end="${totalPages}">
					<li class="page-item"><c:choose>
							<c:when test="${currentPage == page}">
								<a href="${contextPath}/customer?page=${page}"
									class="page-link bg-warning">${page}</a>
							</c:when>
							<c:otherwise>
								<a href="${contextPath}/customer?page=${page}" class="page-link">${page}</a>
							</c:otherwise>
						</c:choose></li>
				</c:forEach>

				<c:if test="${currentPage!=totalPages}">
					<li class="page-item"><a
						href="${contextPath}/customer?page=${currentPage+1}"
						aria-label="Next" class="page-link"> <span aria-hidden="true">&raquo;</span>
					</a></li>
				</c:if>
			</ul>
		</nav>
	</main>

	<footer class="bg-light fixed-bottom py-3 text-center">
		<div class="container-fluid">
			<span class="text-muted">CMA made with JAVA10 &#129392;
				09.01.2022</span>
		</div>
	</footer>
	
	
	<script src="${contextPath}/resources/js/script.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
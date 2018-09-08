<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Yahoo!!</title>
<!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
	width: auto;
	max-width: 680px;
	padding: 0 15px;
}
</style>
</head>

<body>

	<nav role="navigation" class="navbar navbar-default">

		<div class="">
			<a href="/" class="navbar-brand">Brand</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/list-todo.do">Todos</a></li>
				<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do">Logout</a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<H1>Welcome ${name}</H1>

		<div>
			Your Todos are

			<table class="table table-striped table-bordered">
				<thead>
					<th>Description</th>
					<th>Category</th>
					<th></th>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.name}</td>
							<td>${todo.category}</td>
							<td><a  class="btn btn-danger"
								href="/deletetodo.do?todo=${todo.name}&category=${todo.category}">Delete
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<a class="btn btn-success" href="/add-todo.do">Add Todo</a>

	</div>

	<footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>
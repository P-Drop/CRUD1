<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Academia Asimov</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
<header></header>
<c:if test="${empty alumnos}">
<div class="container my-4 text-center">
<h2>LA BASE DE DATOS DE ALUMNOS ESTÁ VACÍA</h2>
</div>
</c:if>
<c:if test="${not empty alumnos}">
<div class="container text-center">
	<table class="table table-dark table-striped table-borderless">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Nombre</th>
				<th scope="col">Edad</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alumnos}" var="al">
				<tr class="align-middle">
					<th scope="row"><c:out value="${al.id}" /></th>
					<td><c:out value="${al.nombre}" /></td>
					<td><c:out value="${al.edad}" /></td>
				</tr>
			</c:forEach> 
		</tbody>
</table>
</div>
</c:if>
<div class="container">
<a href="index.jsp" class="btn btn-primary">ATRAS</a>
</div>
<footer></footer>
</body>
</html>
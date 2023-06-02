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
<div class="container text-center">
<div class="my-20">
<h1>ACADEMIA</h1>
<h1>ASIMOV</h1>
</div>
</div>
<div class="container text-center">
<div class="row my-2">
<div class="col-3"></div>
<div class="col-6">
<a href="alta.jsp" class="btn btn-dark">Insertar un alumno</a>
</div>
</div>
<div class="row my-2">
<div class="col-3"></div>
<div class="col-6">
<a href="ControllerWeb1?opcion=eliminar" class="btn btn-dark">Eliminar un alumno</a>
</div>
</div>
<div class="row my-2">
<div class="col-3"></div>
<div class="col-6">
<a href="ControllerWeb1?opcion=modificar" class="btn btn-dark">Modificar un alumno</a>
</div>
</div>
<div class="row my-2">
<div class="col-3"></div>
<div class="col-6">
<a href="ControllerWeb1?opcion=mostrar" class="btn btn-dark">Consultar alumnos</a>
</div>
</div>
</div>
<div class="container">
<c:if test="${not empty msg}">
<c:out value="${msg}"/>
</c:if>
</div>
<footer></footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="container">
<div class="my-4 text-center text-dark">
<h1>REGISTRO</h1>
</div>
</div>
<div class="container">
<form action="ControllerWeb1" method="post" class="needs-validation" novalidate>
<label for="nombre" class="form-label">Nombre:</label>
<input type="text" name="nombre" class="form-control" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+" required>
<label for="edad" class="form-label">Edad:</label>
<input type="text" name="edad" class="form-control" pattern="[1-9][0-9]{0,1}|99" required>
<div class="my-4 text-center">
<input type="submit" class="btn btn-dark" value="Enviar">
</div>
</form>
</div>
<div class="container">
<a href="index.jsp" class="btn btn-primary">ATRAS</a>
</div>
<footer></footer>
</body>
<script src="js/script.js"></script>
</html>
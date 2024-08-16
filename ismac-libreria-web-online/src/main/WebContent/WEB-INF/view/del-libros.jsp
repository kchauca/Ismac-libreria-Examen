<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="del" method="get">
	<input type="hidden" id="idLibro" name="idLibro" value="${libro.idLibro}">
	<strong>
		¿Desea eliminar este dato?
	</strong>
	<button type="submit" onclick="">Eliminar</button>
	</form>
	<button type="button" onclick="window.location.href='/ismac-libreria-web-online/libros/findAll'; return false;">Cancelar</button>
</body>
</html>
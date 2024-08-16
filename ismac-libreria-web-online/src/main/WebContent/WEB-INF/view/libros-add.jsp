<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
	<input type="hidden" id="idLibro" name="idLibro" value="${libro.idLibro}">
	</br>
	</br>
	Titulo
	<input type="text" id="titulo" name="titulo" value="${libro.titulo}">
	</br>
	</br>
	Editorial
	<input type="text" id="editorial" name="editorial" value="${libro.editorial}">
	</br>
	</br>
	Numero de Paginas
	<input type="number" id="numPaginas" name="numPaginas" value="${libro.numPaginas}">
	</br>
	</br>
	Edición
	<input type="text" id="edicion" name="edicion" value="${libro.edicion}">
	</br>
	</br>
	Idioma
	<input type="text" id="idioma" name="idioma" value="${libro.idioma}">
	</br>
	</br>
	Fecha de Publicación
	<input type="date" id="fechaPublicacion" name="fechaPublicacion" value="${fn:substring(libro.fechaPublicacion,0,10)}">
	</br>
	</br>
	Descripción
	<input type="text" id="descripcion" name="descripcion" value="${libro.descripcion}">
	</br>
	</br>
	Tipo de Pasta
	<input type="text" id="tipoPasta" name="tipoPasta" value="${libro.tipoPasta}">
	</br>
	</br>
	ISBN
	<input type="text" id="ISBN" name="ISBN" value="${libro.ISBN}">
	</br>
	</br>
	Numero de Ejemplares
	<input type="number" id="numEjemplares" name="numEjemplares" value="${libro.numEjemplares}">
	</br>
	</br>
	Portada
	<input type="text" id="portada" name="portada" value="${libro.portada}">
	</br>
	</br>
	Presentación
	<input type="text" id="presentacion" name="presentacion" value="${libro.presentacion}">
	</br>
	</br>
	Precio
	<input type="number" id="precio" name="precio" value="${libro.precio}">
	</br>
	</br>
	
	Categoria
	<select id="idCategoria" name="idCategoria">
	
	<c:forEach var="item" items="${categorias}">
		<option value="${item.idCategoria}" ${item.idCategoria == libro.categoria.idCategoria ? 'selected' : '' } >${item.categoria}</option>
	</c:forEach>
		
	</select>
	</br>
	</br>
	
	Autor
	<select id="idAutor" name="idAutor">
	<c:forEach var="item" items="${autores}">
		<option value="${item.idAutor}" ${item.idAutor == libro.autor.idAutor ? 'selected' : '' } > ${item.nombre} ${item.apellido} </option>
	</c:forEach>
	</select>
	</br>
	</br>
	<button type="submit" onclick="">Guardar</button>
	<button type="button" onclick="window.location.href='/ismac-libreria-web-online/libros/findAll'; return false;">Cancelar</button>
	</form>
</body>
</html>
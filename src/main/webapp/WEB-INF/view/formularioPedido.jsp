<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>
</head>
<body>
<h1>Insertar Pedido </h1>
	<!--  insertarPedido es el método de la interfaz -->
	<form:form action="insertarPedido" modelAttribute="pedido" method="POST">
	<!-- para usarlo en la parte de modificar el registro ya que carga el id también al recuperar el registro -->
	<form:hidden path="id"/>
	<table border="1">
		<tr>
		<td>Numpedido</td><td><form:input path="numpedido"/></td>
		</tr>
		<tr>
		<td>Fecha</td><td><form:input path="fecha"/></td>
		</tr>
		<tr>
		<td>Importe</td><form:input path="importe"/></td>
		</tr>
		<tr>
		<tr>
		<td>Descuento</td><td><form:input path="descuento"/></td>
		</tr>
		<td colspan="2"><input type="submit" value="Insertar/Actualizar"></td>
		</tr>
	</table>
	
	</form:form>

</body>
</html>
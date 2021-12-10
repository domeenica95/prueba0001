<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pedidos</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>
<link rel="stylesheet" hclref="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
<c:forEach var="PedidosTemp" items="${Pedidos }">

<!-- link para actualizar -->
<c:url var="linkPedidos" value="/Pedidos/muestraFormularioPedidos"><!-- nos lleva a la url a modificar -->
<c:param name="idPedido" value="${PedidosTemp.idPedido }"/> <!-- el parámetro que le pasamos a la url -->
</c:url>
<td>${PedidosTemp.numpedido}</td>
<td>${PedidosTemp.apellido}</td>
<td>${PedidosTemp.fecha}</td>
<td>${PedidosTemp.importe}</td>
<td>${PedidosTemp.descuento}</td>
<td>${PedidosTemp.idCliente}</td>
<td><a href="${linkActualizar }"><input type="button" value="Modificar"/></a></td>
<td><a href="${linkEliminar }"><input type="button" value="Eliminar"
onclick="if(!(confirm('vas a eliminar un registro. ¿Estás seguro?')))"/></a></td>
<td><a href="${linkPedidos}"><input type="button" value="Pedidos"/></a></td>
</c:forEach>
<center>
<input type="button" class="btn btn-success" value="Pedidos" onclick="window.location.href='muestraFormularioPedidos'; return false;">

</center>
</body>
</html>
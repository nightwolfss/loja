<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="dao" class="persistence.GenericDao" scope="request" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pedido</title>
</head>
<body>
<h3>Pedido</h3>
<table class="table table-sm table-striped table-dark" border="1">
<tr><th>X</th><th>Nome</th><th>Valor</th><th>Tipo</th><th>Descrição</th></tr>
<c:forEach var="var" items="${dao.listaProdutos}">
	<tr><td><input type="checkbox" name="checked"></td><td>${var.nomeProduto}</td><td>${var.valor}</td><td>${var.tipoProduto}</td><td>${var.descricaoProduto}</td></tr>
</c:forEach>
</table>

<table class="table table-sm table-striped table-dark" border="1">
<tr><th>X</th><th>Nome</th><th>Valor</th><th>Tipo</th><th>Descrição</th></tr>
<c:forEach var="var" items="${dao.listaProdutos}">
	<tr><td><input type="checkbox" name="checked"></td><td>${var.nomeProduto}</td><td>${var.valor}</td><td>${var.tipoProduto}</td><td>${var.descricaoProduto}</td></tr>
</c:forEach>
</table>

<table class="table table-sm table-striped table-dark" border="1">
<tr><th>X</th><th>Nome</th><th>Valor</th><th>Tipo</th><th>Descrição</th></tr>
<c:forEach var="var" items="${dao.listaProdutos}">
	<tr><td><input type="checkbox" name="checked"></td><td>${var.nomeProduto}</td><td>${var.valor}</td><td>${var.tipoProduto}</td><td>${var.descricaoProduto}</td></tr>
</c:forEach>
</table>

</body>
</html>
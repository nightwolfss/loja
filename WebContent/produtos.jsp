<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="dao" class="persistence.GenericDao" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produtos</title>
</head>
<body>
<h1>Cadastro de Produtos</h1>
<form action="Controller?cmd=cadproduto" method="post">
	<div>
		<table>
			<tr><td>Nome:</td><td><input type="text" name="nome" id="nome" required="required"></td></tr>
			<tr><td>Valor:</td><td><input type="text" name="valor" required="required"></td></tr>
			<tr><td>Descri��o:</td><td><textarea cols=30 rows="5" name="descricao" id="descricao"></textarea></td></tr>
			<tr><td></td><td align="right"><input type="submit" value="Cadastrar"  id="enviar"></td></tr>
		</table>
	</div>
</form>

<br/>
<hr/>
<table border="1">
<tr><td>id</td><td>Nome</td><td>Valor</td><td>Descri��o</td></tr>
<c:forEach var="var" items="${dao.listaProdutos}">
	<tr><td>${var.idProduto}</td><td>${var.nomeProduto}</td><td>${var.valor}</td><td>${var.descricaoProduto}</td></tr>
</c:forEach>
</table>
${msg}

</body>
</html>
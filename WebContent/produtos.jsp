<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="dao" class="persistence.GenericDao" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, user-scalable=no">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

<title>Produtos</title>
</head>
<body>
<div class="container">
<h1>Cadastro de Produtos</h1>
<hr/>
<form action="Controller?cmd=cadproduto" method="post">

			<table>
				<tr>
					<td>Nome:</td>
					<td><input class="form-control form-control-sm" type="text"
						name="nome" id="nome" required="required"></td>
				</tr>
				<tr>
					<td>Valor:</td>
					<td><input class="form-control form-control-sm" type="text"
						name="valor" required="required"></td>
				</tr>
				<tr>
					<td>Tipo:</td>
					<td><select id="tipo" name="tipo"><option value="hamburger">hamburguer</option>
							<option value="hamburger">hamburguer</option>
							<option value="bebidas">bebidas</option>
							<option value="sucos">sucos</option>
							<option value="promo">promoção</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Descrição:</td>
					<td><textarea class="form-control form-control-sm" cols=30
							rows="5" name="descricao" id="descricao"></textarea></td>
				</tr>
				<tr>
					<td></td>
					<td align="right"><input class="btn btn-warning" type="submit"
						value="Cadastrar" id="enviar"></td>
				</tr>
			</table>
		</form>

<br/>
<hr/>
<table class="table table-sm table-striped table-dark" border="1">
<tr><th>id</th><th>Nome</th><th>Valor</th><th>Tipo</th><th>Descrição</th></tr>
<c:forEach var="var" items="${dao.listaProdutos}">
	<tr><td>${var.idProduto}</td><td>${var.nomeProduto}</td><td>${var.valor}</td><td>${var.tipoProduto}</td><td>${var.descricaoProduto}</td></tr>
</c:forEach>
</table>
</div>
${msg}

</body>
</html>
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

<title>Usuários</title>
</head>
<body>

<style>
	#tabela1{
		width: 70%;
	}
	
	.tds{
		width: 20%;
	}
</style>

<script type="text/javascript">
$(document).ready(function(){
$("#senha, #senhaconf").keyup(function(){

	var senha = $("#senha").val();
	var senhaconf = $("#senhaconf").val();
	
	if(senha == senhaconf){
		$("#conf").text('Senhas Iguais');
		
	}
	else{
		$("#conf").text('A Senhas não conferem');
	}
});

$("#enviar").click(function(){

	var senha = $("#senha").val();
	var senhaconf = $("#senhaconf").val();
	
	if(senha != senhaconf){
		alert('A Senhas não conferem');
		location.href = "usuarios.jsp";
	}
});

});


</script>

<div class="container">
<h1>Cadastro de Usuários</h1>
<form action="Controller?cmd=cadusuario" method="post">
	<div id="tabela1">
		<table class="table">
			<tr><td class="tds">Nome Completo:</td><td><input class="form-control form-control-sm" type="text" name="nome" id="nome" required="required"></td></tr>
			<tr><td class="tds">Login:</td><td><input class="form-control form-control-sm" type="text" name="login" required="required"></td></tr>
			<tr><td class="tds">Senha:</td><td><input class="form-control form-control-sm" type="password" name="senha" id="senha" required="required" minlength=3></td></tr>
			<tr><td class="tds">Confirmar Senha:</td><td><input class="form-control form-control-sm" type="password" name="senhaconf" id="senhaconf" required="required"></td></tr>		
			<tr><td class="tds">Tipo Acesso:</td><td align="right"><input type="radio" name="tipo" value="adm"> Admin? | <input type="radio" name="tipo" value="usr">Comum? </td></tr>
			<tr><td class="tds"></td><td align="right"><input type="submit" value="Cadastrar"  id="enviar"></td></tr>
		</table>
	</div>
</form>
</div>
<p id="conf">${msg}</p>

<c:forEach var="var" items="${dao.listaUsuarios}">

${var}
</c:forEach>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Usuários</title>
</head>
<body>
<h1>Cadastro de Usuários</h1>


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

<form action="Controller?cmd=cadusuario" method="post">
	<div>
		<table>
			<tr><td>Nome Completo:</td><td><input type="text" name="nome" id="nome" required="required"></td></tr>
			<tr><td>Login:</td><td><input type="text" name="login" required="required"></td></tr>
			<tr><td>Senha:</td><td><input type="password" name="senha" id="senha" required="required" minlength=3></td></tr>
			<tr><td>Confirmar Senha:</td><td><input type="password" name="senhaconf" id="senhaconf" required="required"></td></tr>		
			<tr><td>Tipo Acesso:</td><td align="right"><input type="radio" name="tipo" value="adm"> Admin? | <input type="radio" name="tipo" value="usr">Comum? </td></tr>
			<tr><td></td><td align="right"><input type="submit" value="Cadastrar"  id="enviar"></td></tr>
		</table>
	</div>
</form>

<p id="conf">${msg}</p>
</body>
</html>
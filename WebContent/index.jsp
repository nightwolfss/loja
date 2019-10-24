<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Controller?cmd=consultar" method="post">
Numero: <input type="text" name="id">
<input type="submit" value="consultar">
</form>

${usuario}

</body>
</html>
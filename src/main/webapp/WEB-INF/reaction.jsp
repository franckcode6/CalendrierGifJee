<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter une réaction</title>
<style type="text/css">
  <%@include file="style/theme1.css" %>
</style>
</head>

<body>
	<h1>Ajouter une réaction</h1>
	<img src ="${gif.url}">
	<form
		action=""
		method="post">
		<label>Réaction</label>
		<select name="emotion_id">
		<option >Merci de choisir une réaction</option>
		<c:forEach items="${emotions}" var="emotion">
		<option value="${emotion.id}">${emotion.nom} : ${emotion.code}</option>
		</c:forEach>
		</select><br>
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>
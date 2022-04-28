<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="style/theme1.css" %>
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Calendrier GIF, page d'accueil :)</h1>
Utilisateur connecté:${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} ${sessionScope.utilisateur.email}
</body>
</html>
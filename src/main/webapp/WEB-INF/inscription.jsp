<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
    <style type="text/css">
<%@include file="style/themeJ.css"%>
</style>
</head>
<body>
    <h1>Inscription</h1>
    <form action="inscription" method="post">
        <label for="nom">Nom</label><input name="nom"><br> 
        <label for="prenom">Prénom</label><input name="prenom"><br> 
        <label for="email">Email</label><input type="email" name="email"><br> 
        <label for="mot_de_passe">Mot de passe</label><input type="password" name="mot_de_passe"><br> 
        <label for="theme_id">Thème</label>
        <select name="theme_id">
            <option value="0">Merci de choisir un thème</option>
            <c:forEach items="${themes}" var="theme">
                <option value="${theme.id}">${theme.nom}</option>
            </c:forEach>
        </select><br> <input class ="button" type="submit" value="inscription">
    </form>
</body>
</html>
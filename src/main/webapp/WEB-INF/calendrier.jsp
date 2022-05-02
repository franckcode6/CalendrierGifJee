<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:choose>
    <c:when test="${sessionScope.utilisateur.theme.id eq 1}">
       	<style type="text/css">
 			<%@include file="style/bachata.css" %>
		</style>
    </c:when>    
    <c:otherwise>
       <style type="text/css">
 			<%@include file="style/dark.css" %>
		</style>
    </c:otherwise>
</c:choose>
<meta charset="ISO-8859-1">
<title>Calendrier Gif</title>
</head>

<body>
<header>
<h1>Calendrier</h1>
<!-- Affichage des informations utilisateur -->
<h2>Utilisateur : ${sessionScope.utilisateur.prenom} - solde : ${sessionScope.utilisateur.nbPoints} points <a href="deconnexion">Déconnexion</a></h2>
</header>
<table>
	<thead>
		<tr>
			<th>Jour</th>
			<th colspan="5">Gif</th>
			<th colspan="3">Utilisateur</th>
			<th colspan="3">Reactions</th>
		</tr>
	</thead>
	<tbody>
<!-- 		Creation d'une boucle pour chaque jour dans mon tableau jours (cf CalendrierServlet)
			On renvoie une ligne du tableau pour chaque élément -->
		<c:forEach items="${jours}" var="jour">
		<tr>
			<td>${jour.date}</td>
			<td colspan="5">
				<c:choose>
					<c:when test="${jour.gif eq null}">
						<p>${jour.nbPoints} points</p>
						<ul>
							<li>
							<a href="gifdistant?date=${jour.date}">Placer un gif distant</a>
							</li>
							<li>
							<a href="gifteleverse?date=${jour.date}">Placer un gif téléversé</a>
							</li>
							</ul>
					</c:when>
				<c:otherwise>
					<c:if test="${jour.gif.legende ne null && jour.gif.legende ne ''}">
					<h2>${jour.gif.legende}</h2>
					</c:if>
					<c:if test="${jour.gif.getClass().simpleName eq 'GifDistant'}">
					<img src="${jour.gif.url}" height="200" alt="Super image du calendrier !">
					</c:if>
					<c:if test="${jour.gif.getClass().simpleName eq 'GifTeleverse'}">
					<img src="img/${jour.gif.id}.gif" height="200" alt="${jour.gif.nomFichierOriginal}" title="${jour.gif.nomFichierOriginal}">
					</c:if>
				</c:otherwise>
				</c:choose>
			</td>
			
			<td colspan="3">${jour.gif.utilisateur.prenom} ${jour.gif.utilisateur.nom}</td>
			
			<td colspan="3">
			<c:if test="${jour.gif ne null}">
				<ul>
					<c:forEach items="${jour.gif.reactions}" var="reaction">
						 <li>${reaction.emotion.code} ${reaction.utilisateur.prenom} ${reaction.utilisateur.nom}</li> 
					</c:forEach> 
					<li><a href="reaction?gif_id=${jour.gif.id}">Réagir</a></li>
				</ul>
				</c:if>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
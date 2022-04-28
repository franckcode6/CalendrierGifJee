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
<header>
<h1>Calendrier GIF, page d'accueil :)</h1>
Utilisateur connecté:${sessionScope.utilisateur.nom} ${sessionScope.utilisateur.prenom} ${sessionScope.utilisateur.email}
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
		<c:forEach items="${jours}" var="jour">
		<tr>
			<td>${jour.date}</td>
			
			<td colspan="3">
				<c:choose>
					<c:when test="${jour.gif == null}">
						<p>${jour.nbPoints} points</p>
						<a href="index">Placer un gif distant</a>
					</c:when>
				<c:otherwise>${jour.gif}</c:otherwise>
				</c:choose>
			</td>
			<td colspan="3"></td>
			<td colspan="3"></td>
		</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
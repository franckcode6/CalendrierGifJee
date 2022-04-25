<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link href="./Inscription_files/theme1.css" rel="stylesheet">
</head>
<body>
	<h1>Inscription</h1>
	<form
		action="https://www.digital-learning-hb.com/moodle_hb/pluginfile.php/31361/mod_resource/content/0/inscription"
		method="post">
		<label>Nom</label><input name="nom"><br> <label>Prénom</label><input
			name="prenom"><br> <label>Email</label><input
			type="email" name="email"><br> <label>Mot de
			passe</label><input type="password" name="mot_de_passe"><br> <label>Thème</label>
		<select name="theme_id">
			<option value="0">Merci de choisir un thème</option>
		</select><br> <input type="submit" value="Inscription">
	</form>
</body>
</html>
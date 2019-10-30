<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="menucp.css" rel="stylesheet" type="text/css">
<title>Inserire Nuovo Attore</title>
</head>
<body>
	<div id="wrapper">

		<div id="subscribeBox">
			<h2>
				<span class="thin"></span>
			</h2>
			<p>Inserire in nuovo Attore</p>

			<!-- Start Here: Web Form tutorial -->
			<form class="subscribeForm" name="Subscription Form" method="post"
				action="newCasaProd">

				<input id="nome" type="text" placeholder="Nome Attore"
					name="nome" required> 
				<input id="cognome"
					type="text" placeholder="Nome Cognome"
					name="cognome" required>
				
				<input id="anno_nascita" type="number"
					placeholder="Anno Nascita" name="anno_nascita" required>
				<input id="anno_inizio" type="number"
					placeholder="Anno Inizio" name="anno_inizio" required>
				
				<input id="img" type="text" placeholder="Inserisci path Immagine"
					name="img">
				
				<input id="submit" type="submit" value="Inserisci">

			</form>

		</div>
	</div>
</body>
</html>
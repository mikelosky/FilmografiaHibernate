<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="menucp.css" rel="stylesheet" type="text/css">
<title>Inserire Nuova Casa Produttrice</title>
</head>
<body>
	<div id="wrapper">

		<div id="subscribeBox">
			<h2>
				<span class="thin"><p>Inserire la nuova Casa Produttrice</p></span>
			</h2>
			
			<!-- Start Here: Web Form tutorial -->
			<form class="subscribeForm" name="Subscription Form" method="post"
				action="newCasaProd" >

				<input id="nome" type="text" placeholder="Nome Casa Produttrice" name="nome" required> 
				<input id="sede_principale" type="text" placeholder="Nome Sede Principale" name="sede_principale" required>
				<!-- Step 1: Add an email field here -->
				<input id="anno_fondazione" type="number" placeholder="Anno Fondazione" name="anno_fondazione"
					required>
				<!-- Step 2: Add an address field here -->
				<input id="img" type="text" placeholder="Inserisci path Immagine"
					name="img">
				<!-- Step 3: add a submit button here -->
				<input id="submit" type="submit" value="Inserisci">

			</form>

		</div>
	</div>
</body>
</html>
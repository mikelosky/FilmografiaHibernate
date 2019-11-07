<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="menucp.css" rel="stylesheet" type="text/css">
<title>Inserisci il nuovo Film</title>
</head>
<body>
	<div id="wrapper">

		<div id="subscribeBox">
			<h2>
				<span class="thin"></span>
			</h2>
			<p>Inserire la nuova Casa Produttrice</p>

			<!-- Start Here: Web Form tutorial -->
			<form class="subscribeForm" name="Subscription Form" method="post"
				action="newFilm">

				<input id="nome" type="text" plnewFilmaceholder="Nome Casa Produttrice"	name="nome" required> 
				<!-- Step 1: Add an email field here -->
				<input id="anno_uscita" type="number" placeholder="Anno Uscita" name="anno_uscita" required>
				<input id="incassi" type="number" placeholder="" name="incassi" required>
				
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
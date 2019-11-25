<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica Film</title>
<link href="css/menucp.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">

		<div id="subscribeBox">
			<h2>
				<span class="thin"><p>Modifica il Film</p></span>
			</h2>
			
			<!-- Start Here: Web Form tutorial -->
			<form class="subscribeForm" name="Subscription Form" method="post"
				action="modAttoreSet" >
				<input id="nome" type="hidden" value="${film.getId()}" name="id">	
				<input id="nome" type="text" value="${film.getNome()}" name="nome" required> 
				
				<input id="anno_nascita" type="number" value="${film.getIncassi()}" name="incassi"
					required>

				<span class="thin"><p>La casa produttrice selezionata è: ${film.getAnno_Inizio_Carriera()}</p></span>
				<input id="img" type="text" value="${attore.getImg()}"
					name="img">
				<!-- Step 3: add a submit button here -->
				<input id="submit" type="submit" value="Inserisci">

			</form>

		</div>
	</div>
</body>
</html>
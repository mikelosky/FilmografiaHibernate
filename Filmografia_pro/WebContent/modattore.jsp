<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/menucp.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">

		<div id="subscribeBox">
			<h2>
				<span class="thin"><p>Modifica la Casa Produttrice</p></span>
			</h2>
			
			<!-- Start Here: Web Form tutorial -->
			<form class="subscribeForm" name="Subscription Form" method="post"
				action="modAttoreSet" >
				<input id="nome" type="hidden" value="${attore.getid_Cas_Prod()}" name="id">	
				<input id="nome" type="text" value="${attore.getNome()}" name="nome" required> 
				<input id="cognome" type="text" value="${attore.getCognome()}" name="cognome" required>
				<!-- Step 1: Add an email field here -->
				<input id="anno_nascita" type="number" value="${attore.getanno_Nascita()}" name="anno_nascita"
					required>
				<input id="anno_inizio" type="number" value="${attore.getAnno_Inizio_Carriera()}" name="anno_inizio" required>
				<!-- Step 2: Add an address field here -->
				<input id="img" type="text" value="${attore.getImg()}"
					name="img">
				<!-- Step 3: add a submit button here -->
				<input id="submit" type="submit" value="Inserisci">

			</form>

		</div>
	</div>
</body>
</html>
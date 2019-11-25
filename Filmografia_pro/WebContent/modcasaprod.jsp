<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modif Casa Prod</title>
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
				action="modCasaProdSet" >
				<input id="nome" type="hidden" value="${casaproduttrice.getid_Cas_Prod()}" name="id">	
				<input id="nome" type="text" value="${casaproduttrice.getNome()}" name="nome" required> 
				<input id="sede_principale" type="text" value="${casaproduttrice.getSede()}" name="sede_principale" required>
				<!-- Step 1: Add an email field here -->
				<input id="anno_fondazione" type="number" value="${casaproduttrice.getFondazione()}" name="anno_fondazione"
					required>
				<!-- Step 2: Add an address field here -->
				<input id="img" type="text" value="${casaproduttrice.getImg()}"
					name="img">
				<!-- Step 3: add a submit button here -->
				<input id="submit" type="submit" value="Inserisci">

			</form>

		</div>
	</div>
</body>
</html>
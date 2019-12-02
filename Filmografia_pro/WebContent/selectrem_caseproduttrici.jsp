<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimuovere Casa Prodruttrice</title>
<link href="css/menunewfi.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="wrapper">
		<div id="subscribeBox">
			<h2>
				<span class="thin"><p>Seleziona la casa produttrice da rimuovere.</p></span>
			</h2>

			<form class="subscribeForm" name="Subscription Form" method="post"
				action="remAttore">

				<p>Seleziona Casa Produttrice</p>
				<select id="id_casa_produttrice" name="id_casa_produttrice">
					<option></option>
					<c:forEach var="current" items="${listCP}">
						<option value="${current.getid_Cas_Prod()}">
							${current.getNome()}</option>
					</c:forEach>
					
				</select> 
				
				<!-- Step 3: add a submit button here -->
				<input id="submit" type="submit" value="Elimina">
			</form>
		</div>
	</div>
</body>
</html>
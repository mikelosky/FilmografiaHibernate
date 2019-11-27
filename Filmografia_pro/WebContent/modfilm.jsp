<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>	

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
				action="modFilmSet" >
				<span class="thin"><p>Modifica il nome</p></span>
				<input id="nome" type="hidden" value="${film.getId()}" name="id">	
				<input id="nome" type="text" value="${film.getNome()}" name="nome" required> 
				<input id="anno_uscita" type="number" value="${film.getanno_Uscita()}" name="anno_uscita" required>
				<span class="thin"><p>Modifica il numero di incassi totali</p></span>
				<input id="anno_nascita" type="number" value="${film.getIncassi()}" name="incassi"
					required>

				<span class="thin"><p>La casa produttrice inserita è: ${casaproduttrice.getNome()}</p></span>
				<span class="thin"><p>Leziona la casa produttrice per modificarla</p></span>
				<select id="id_casa_prod" name="id_casa_prod">
					<option></option>
					<c:forEach var="current" items="${listCP}">
						<option value="${current.getid_Cas_Prod()}">
							${current.getNome()}</option>
					</c:forEach>
				</select> 
				<span class="thin"><p>Modifica l`indirizzo dell`immagine:</p></span>
				<input id="img" type="text" value="${film.getImg()}"
					name="img">
				
				<span class="thin"><p>Questa è la lista degli attori in questo film:</p></span>
				
				<c:forEach var="currentai" items="${listATI}">
							${currentai.getNome()}
				</c:forEach>
				
				<span class="thin"><p>Seleziona gli attori che recitano in questo film</p></span>
				<select multiple="multiple" id="my-select" name="attori_list" size="${fn:length(listA)}">
					<c:forEach var="currentaa" items="${listA}">
						<option value="${currentaa.getid_Attori()}">${currentaa.getNome()}</option>
					</c:forEach>
				</select>
				<!-- Step 3: add a submit button here -->
				<input id="submit" type="submit" value="Inserisci">

			</form>

		</div>
	</div>
</body>
</html>
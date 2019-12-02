<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimuovere Film</title>
<link href="css/menunewfi.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<div id="subscribeBox">
			<h2>
				<span class="thin"><p>Seleziona il film da rimuovere.</p></span>
			</h2>

			<form class="subscribeForm" name="Subscription Form" method="post"
				action="remFilm">

				<p>Seleziona Film</p>
				<select id="id_film" name="id_film">
					<option></option>
					<c:forEach var="current" items="${listF}">
						<option value="${current.getId()}">
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
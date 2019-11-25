<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width">
<link href="css/menunewfi.css" rel="stylesheet" type="text/css">

<link href="css/multiselect.css" media="screen" rel="stylesheet"
	type="text/css">
<title>Quali attori?</title>
</head>
<body>
	<div id="wrapper">
		<div id="subscribeBox">
			<h2>
				<span class="thin"><p>Inserire chi recita in questo film</p></span>
			</h2>

			<form class="subscribeForm" name="Subscription Form" method="post" action="newPerformano">
				<input type="hidden" name="id_film" value="${film_Last.getId()}" >
				
				<p>Nel film <a>${film_Last.getNome()}</a> </p>
				<a>${film_Last.getId()}</a>
				<p>Seleziona gli attori che recitano in questo film</p>
				<select multiple="multiple" id="my-select" name="attori_list" size="${fn:length(listA)}">
					<c:forEach var="currenta" items="${listA}">
						<option value="${currenta.getid_Attori()}">${currenta.getNome()}</option>
					</c:forEach>
				</select>
				<input id="submit" type="submit" value="Inserisci">
			</form>
		</div>
	</div>
	<script src="js/jquery.multi-select.js" type="text/javascript"></script>

</body>
</html>
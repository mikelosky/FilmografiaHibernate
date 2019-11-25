<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/menunewfi.css" rel="stylesheet" type="text/css">

<link href="css/multiselect.css" media="screen" rel="stylesheet"
	type="text/css">
<title>Quale film?</title>
</head>
	<body>
		<div id="wrapper">
			<div id="subscribeBox">
				<h2>
					<span class="thin"><p>Inserire chi recita in questo film</p></span>
				</h2>
	
				<form class="subscribeForm" name="Subscription Form" method="post" action="updateFilm">
					
					<p>Selezionare il film dove inserire gli attori</p>
					
					<select id="id_film" name="id_film">
						<c:forEach var="listafilm" items="${listafilm}">
							<option value="${listafilm.getId()}">${listafilm.getNome()}</option>
						</c:forEach>
					</select>
					<input id="submit" type="submit" value="Continua">
				</form>
			</div>
		</div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<link href="menuindex.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1" name="viewport"
	content="width=device-width, initial-scale=1">

<title>Filmatron</title>
</head>
<body>
	<div id="mySidebar" class="sidebar">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
		<a href="newcp.jsp">New Casa Produttrice</a> 
		<a href="newat.jsp">New	Attore</a> 
		<a href="newFilm">New Film</a>
		<a href="#">Contact</a>
	</div>
	

	<div id="main">
		<button class="openbtn" onclick="toggle()">Toggle Sidebar</button>

	</div>

	<script src = "js/main.js">
		
	</script>


	<c:forEach var="current" items="${listCP}">
	
	<div class="container">
		<div class="img-container">
			<img
				src="${current.getImg()}"
				alt="">
		</div>
		<div class="user-info">
			<h2>
				<c:out value="${current.getNome()}" />
			</h2>
			<span>"${current.getFondazione()}"</span>
		</div>
	</div>
	</c:forEach>

</body>
</html>
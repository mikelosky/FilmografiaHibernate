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
		<a href="newcp.jsp">New Casa Produttrice</a> <a href="newat.jsp">New
			Attore</a> <form action='doCasaProd' method='post'><input type="submit"value="Vendite"><a>Visualizza Casa Prod.</a></form> <a href="#">Contact</a>
	</div>
	

	<div id="main">
		<button class="openbtn" onclick="openNav()">Toggle Sidebar</button>

	</div>

	<script>
		function openNav() {
			document.getElementById("mySidebar").style.width = "250px";
			document.getElementById("main").style.marginLeft = "250px";
		}

		function closeNav() {
			document.getElementById("mySidebar").style.width = "0";
			document.getElementById("main").style.marginLeft = "0";
		}
	</script>

	<form action="/doCasaProd">

	<c:forEach var="current" items="${filmatografia.listCP}">
		<h2>
			<c:out value="${current.getNome()}" />
			
		</h2>
	</c:forEach>
	</form>
	<div class="container">
		<div class="img-container">
			<img
				src="https://images.unsplash.com/photo-1534809027769-b00d750a6bac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1534&q=80"
				alt="">
		</div>
		<div class="user-info">
			<h2>
				<c:out value="${current.getNome()}" />
			</h2>
			<span>20-july</span>
		</div>
	</div>


</body>
</html>
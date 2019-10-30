<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${listCP}" var="current">
		<tr>
			<td>${current.getNome()} </td>
			<td>${current.getCognome()}</td>
			<td>{current.getData().toString().substring(0, 10)}</td>
		</tr>
	</c:forEach>
	<a href="index.jsp">Index</a>
</body>
</html>
<%-- IMPORTAZIONE NECESSARIA---%>
<%@page import="it.rf.autolavaggio.model.Utente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%-- casting necessario per l'oggetto che ci arriva---%>
<%
Utente u=(Utente)request.getAttribute("oggettodapassare"); 

Utente u2=(Utente)session.getAttribute("oggettodapassare");
%>


</head>
<body>
<p>
l'utente � <%=u.getUsername() + u.getPassword() %>


l'utente � <%=u2.getUsername() + u2.getPassword() %>
</p>



</body>
</html>
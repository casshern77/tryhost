<!-- oggetto bean già creato in index quindi tomcat non lo ricrea ma
rende disponibile il vecchio oggetto con quello che già c'è dentro -->
<jsp:useBean id="oggetto" scope="application" class="beans.RaccoltaContaAccessi"/>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% oggetto.aggiungiAccesso("pagina1.jsp"); %>
<br>
<br>
<a  href="index.jsp"> index </a>
<br>
<br>
<a  href="stampaAccessi.jsp"> stampa accessi </a>
</body>
</html>
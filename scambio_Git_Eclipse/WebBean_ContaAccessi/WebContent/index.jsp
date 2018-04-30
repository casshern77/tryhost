<!-- 
TOMCAT quando legge questo codice crea un oggetto ArrayList vuoto (se già non è stato creato)
perché viene invocato il metodo costruttore RaccoltaContaAccessi()
Esso verrà riempito dal metodo aggiungiAccesso qui sotto
-->
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

<% oggetto.aggiungiAccesso("index.jsp"); %>
<br>
<br>
<a  href="pagina1.jsp"> pagina 1 </a>
<br>
<br>
<a  href="stampaAccessi.jsp"> stampa accessi </a>
</body>
</html>
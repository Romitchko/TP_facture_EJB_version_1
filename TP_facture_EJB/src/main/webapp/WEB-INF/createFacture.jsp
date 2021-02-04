<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvelle facture !</title>
<%@include file="commons/header.jsp"%>
</head>
<body>
 <%@include file="commons/menu.jsp"%>

<form action="create" method="post">
 <label for="dateFacture">Date</label> <input type="text" name="dateFacture" />
 <label for="prixtotalFacture">Prixtotal</label> <input type="text" name="prixtotalFacture" />
 <label for="numeroFacture">Numerofacture</label> <input type="text" name="numeroFacture" />
 
 <input type="submit" value="Valider">
</form>
 <%@include file="commons/footer.jsp"%>

</body>
</html>
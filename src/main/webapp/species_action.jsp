<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.content.*" %>
    <%@page import="com.crud.*" %>
 <%@ page import="com.dbconnector.*" %>
 <%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>species_action.jsp</title>
</head>
<body>
<%
String  lifestyle = request.getParameter("Specieslifestyle");
String  status = request.getParameter("Speciesstatus");
String  group = request.getParameter("Speciesgroup");
String  type = request.getParameter("SpeciesType");
DBManager dbManager =new DBManager();
try{
dbManager.getConnection();
out.println("Connection Successfully");
Species s = new Species(lifestyle,status,group,type);
SpeciesContentManager scm = new SpeciesContentManager();
int rowInserted = scm.insert(s);
if(rowInserted==1){
	out.print("Successfully inserted");
}
}
catch(SQLException e){
	e.printStackTrace();
}
%>
</body>
</html>
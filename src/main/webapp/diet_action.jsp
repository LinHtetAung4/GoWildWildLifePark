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
<title>diet_action.jsp</title>
</head>
<body>
<%
String diettype= request.getParameter("Diettype");
int numberoffeed = Integer.valueOf(request.getParameter("Dietnumberoffeed"));
DBManager dbManager =new DBManager();
try{
dbManager.getConnection();
out.println("Connection Successfully");
 Diet d = new Diet(diettype,numberoffeed );
DietManager dm=new DietManager();
int rowInserted = dm.insert(d);
if(rowInserted==1){
	out.print("Successfully inserted");
}
}
catch (SQLException e){
	e.printStackTrace();}
%>
</body>
</html>
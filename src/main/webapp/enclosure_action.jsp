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
<title>enclosure_action.jsp</title>
</head>
<body>
<%
String eLocation = request.getParameter("Enclosure location");
String eType = request.getParameter("Enclosure type");

out.println("Connection Successfully");
DBManager dbManager =new DBManager();
try{
dbManager.getConnection();
out.println("Connection Successfully");
 Enclosure ec = new Enclosure(eLocation,eType );
EnclosureManager ecm=new EnclosureManager();
int rowInserted = ecm.insert(ec);
if(rowInserted==1){
	out.println("Successfully inserted");
}
}
catch (SQLException e){
	e.printStackTrace();
}
%>
</body>
</html>
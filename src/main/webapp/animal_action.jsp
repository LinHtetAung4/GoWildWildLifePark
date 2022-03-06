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
<title>animal_action</title>
</head>
<body>
<% 
String  name = request.getParameter("Aname");
String gender = request.getParameter("AGender");
int year = Integer.valueOf(request.getParameter("Ayear"));
int speciesid = Integer.valueOf(request.getParameter("speciesID"));
int keeperid = Integer.valueOf(request.getParameter("KeeperID"));
int enclosureid = Integer.valueOf(request.getParameter("EnclosureID"));
int dietid = Integer.valueOf(request.getParameter("DietID"));

out.println("Connection Successfully");
DBManager dbManager =new DBManager();
try{
dbManager.getConnection();
out.println("Connection Successfully");
Animal a = new Animal(name,gender,year,speciesid,keeperid,enclosureid,dietid);
AnimalContentManager acm=new AnimalContentManager();
int rowInserted = acm.insert(a);
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
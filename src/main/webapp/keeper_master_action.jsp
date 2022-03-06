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
<title>keeper_master_action.jsp</title>
</head>
<body>
<%
String keeperName = request.getParameter("keepername");
String keeperDOB = request.getParameter("DOB");
String keeperEmail = request.getParameter("Email");
String keeperPhone = request.getParameter("Phone");
String keeperType = request.getParameter("Type");
DBManager dbManager =new DBManager();
try{
dbManager.getConnection();
out.println("Connection Successfully");
keepers c = new keepers(keeperName,keeperDOB,keeperEmail,keeperPhone,keeperType);
keeperManager kcm=new keeperManager();
int rowInserted = kcm.insert(c);
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
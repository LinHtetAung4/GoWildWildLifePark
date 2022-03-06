<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.crud.*" %>
 <%@ page import="com.dbconnector.*" %>
 <%@ page import="com.content.*" %>
 <%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int id = Integer.valueOf(request.getParameter("idkeepers"));
String name= request.getParameter("keepername");
String DOB= request.getParameter("keeperdateofbirth");
String email= request.getParameter("keeperemail");
String phone= request.getParameter("keeperphone");
String rank= request.getParameter("keeperrank");

keeperManager ecm = new keeperManager();
keepers keeper = new keepers(id,name,DOB,email,phone,rank);
int rowsAffected;
try {

    rowsAffected = ecm.update(keeper);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>
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
<% int id = Integer.valueOf(request.getParameter("idkeeper"));
String name= request.getParameter("name");
String DOB= request.getParameter("date_of_birth");
String email= request.getParameter("email");
String phone= request.getParameter("phone");
String rank= request.getParameter("rank");

keeperManager km = new keeperManager();
keepers keeper = new keepers(id,name,DOB,email,phone,rank);
int rowsAffected;
try {

    rowsAffected = km.update(keeper);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>
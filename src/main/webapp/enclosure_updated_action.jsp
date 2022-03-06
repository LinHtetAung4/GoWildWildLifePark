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
<% int id = Integer.valueOf(request.getParameter("EnclosureId"));
String type= request.getParameter("Enclosuretype");
String location= request.getParameter("Enclosurelocation");

EnclosureManager ecm = new EnclosureManager();
Enclosure enclosure = new Enclosure(id,type,location);
int rowsAffected;
try {

    rowsAffected = ecm.update(enclosure);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>

</body>
</html>
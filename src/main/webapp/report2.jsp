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
<title >Report 2</title>
<style >

table, th, td {
  border: 1px solid red;
}
table{color:blue;
 width:100%;
}
h1{color:Tomato;
text-align:center;}
th{
height:50px;
font-size:200%;}
td{font-size:150%;
text-align:center;
}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	//select
	AnimalContentManager animalContentManager = new AnimalContentManager();
	ArrayList<Animal> animals = animalContentManager.selectTotalAnimalCount();
%>
<h1>Report2</h1>
<table>
<tr>
<th>Keeper Name</th>
<th>Total Animal</th>
</tr>
<%
for(Animal eachAnimal:animals ){
%>
<tr>
<td><%=eachAnimal.getKeepername() %></td>
<td><%=eachAnimal.getTotalanimals() %></td>
</tr>
<%
} 
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</table>
</body>
</html>
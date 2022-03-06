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
<title>Report 1</title>
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
height:50px;}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	
	//select
	AnimalContentManager animalContentManager = new AnimalContentManager();
	ArrayList<Animal> animals = animalContentManager.selectAllAnimalsByKeeperName();
%>
<h1 style="text-align:center">Report1</h1>
<table>
<tr>
<th>Animal ID</th>
<th>Animal Name</th>
<th>Gender</th>
<th>Animal Year</th>
<th>Keeper ID</th>
<th>Keeper Name</th>
</tr>
<%
for(Animal eachAnimal:animals ){
%>
<tr>
<th><%=eachAnimal.getIdanimal() %></th>
<th><%=eachAnimal.getName() %></th>
<th><%=eachAnimal.getGender() %></th>
<th><%=eachAnimal.getYear() %></th>
<th><%=eachAnimal.getIdkeepers() %></th>
<th><%=eachAnimal.getName() %></th>
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
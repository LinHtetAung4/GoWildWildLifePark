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
<style>
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
font-size:150%}
td{font-size:100%;
text-align:center;
}
</style>
</head>
<body>

<%
DBManager dbManager = new DBManager();
try{
dbManager.getConnection();
out.print("Connection Successfully");
AnimalContentManager Animals = new AnimalContentManager();
ArrayList<Animal> animalList= Animals.selectAllAnimals();
%>
<h1>Animal List</h1>
<table >
<tr>
<th>Animal Id</th>
<th>Name</th>
<th>Gender</th>
<th>Year</th>
<th>Species Id</th>
<th>Keepers Id</th>
<th>Enclosure Id</th>
<th>Diet Id</th>
</tr>
<%
for(Animal eachAnimal:animalList){%>
<tr>
<td><%=eachAnimal.getIdanimal()%></td>
<td><%=eachAnimal.getName()%></td>
<td><%=eachAnimal.getGender() %></td>
<td><%=eachAnimal.getYear() %></td>
<td><%=eachAnimal.getIdspecies() %></td>
<td><%=eachAnimal.getIdkeepers() %></td>
<td><%=eachAnimal.getIdenclosure() %></td >
<td><%=eachAnimal.getIddiet() %></td>
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
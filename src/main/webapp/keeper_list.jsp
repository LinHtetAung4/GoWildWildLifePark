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
font-size:150%;}
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
keeperManager keepers = new keeperManager();
ArrayList<keepers> keeper= keepers.selectAll();
%>
<h1>Keeper List</h1>
<table>
<tr>
<th>Keeper Id</th>
<th>Keeper Name</th>
<th>Keeper Date of Birth</th>
<th>Keeper Email</th>
<th>Keeper Phone</th>
<th>Rank</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
for(keepers eachKeeper:keeper){%>
<tr>
<td><%=eachKeeper.getIdkeepers()%></td>
<td><%=eachKeeper.getName()%></td>
<td><%=eachKeeper.getDate_of_birth() %></td>
<td><%=eachKeeper.getKeeper_email() %></td>
<td><%=eachKeeper.getKeeper_phone() %></td>
<td><%=eachKeeper.getRank() %></td>
<td><a href="keeper_update.jsp?id=<%=eachKeeper.getIdkeepers()%>">Edit</a></td>
<td><a href="keeper_deleted_action.jsp?id=<%=eachKeeper.getIdkeepers()%>">Delete</a></td>
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
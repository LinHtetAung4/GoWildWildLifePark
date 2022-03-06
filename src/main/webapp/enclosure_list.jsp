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
EnclosureManager enclosureManager = new EnclosureManager();
ArrayList<Enclosure> enclosures= enclosureManager.selectAll();
%>
<h1>Enclosure List</h1>
<table style="width:100%">
<tr>
<th>Enclosure Id</th>
<th>Type</th>
<th>Location</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
for(Enclosure eachEnclosure:enclosures){%>
<tr>
<td><%=eachEnclosure.getIdenclosure() %></td>
<td><%=eachEnclosure.getType()%></td>
<td><%=eachEnclosure.getLocation() %></td>
<td><a href="enclosureupdate.jsp?id=<%=eachEnclosure.getIdenclosure()%>">Edit</a></td>
<td><a href="enclosure_deleted_action.jsp?id=<%=eachEnclosure.getIdenclosure()%>">Delete</a></td>

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
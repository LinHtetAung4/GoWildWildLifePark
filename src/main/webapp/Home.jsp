<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go Wild Wildlife Park</title>

<style>
body {
  background-image: url('images/Zoo.jpg');
  height:950px;
  width: 1240px;
  display:flex;
  justify-content:center;
  background-size:cover;
}

a:link {
  color: green;
  background-color: transparent;
  text-decoration: none;
}
a:visited {
  color: blue;
  background-color: transparent;
  text-decoration: none;
}
a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}
a:active {
  color: yellow;
  background-color: transparent;
  text-decoration: underline;
}
ul {
  list-style: none;
}

ul li::before {
  content: "\2022";
  color: red;
  font-weight: bold;
  display: inline-block; 
  width: 1em;
  margin-left: -1em;
}
a{font-size:200%;}
</style>
</head>
<body>
<form>
<h1 style="color:blue;">Go Wild Wild life Park</h1>

<ul><li><a href="https://www.Home.com/">Home</a></li></ul>
<br>
<ul><li><a href="KeeperMaster.html">Add Keeper</a></li></ul>
<ul><li><a href="keeper_list.jsp">View and edit Keepers</a></li></ul>
<br>
<ul><li><a href="animal.html">Add Animal</a></li></ul>
<ul><li><a href="animal_list.jsp">View Animal List</a></li></ul>
<br>
<ul><li><a href="enclosure.html">Add Enclosure</a></li></ul>
<ul><li><a href="enclosure_list.jsp">View and edit Enclosures</a></li></ul>
<br>
<ul><li><a href="diet.html">Add Diet</a></li></ul>
<br>
<ul><li><a href="species.html">Add Species</a></li></ul>
<br>
<ul><li><a href="report1.jsp">Report 1</a></li></ul>
<ul><li><a href="report2.jsp">Report 2</a></li></ul>
</form>
</body>
</html>
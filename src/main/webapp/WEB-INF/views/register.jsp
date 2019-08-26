<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>

<body>
<h2>${ username1}</h2>
<form action="/registerprocess" method="post">
First name: <input type="text" name="username" ><br>
Last name: <input type="password" name="password" ><br>
Email Id:  &nbsp&nbsp&nbsp<input type="email" name="email"><br>
<input type="submit" value="Register">
<a href="homepage.jsp">Home</a>
</form>

</body>
</html>
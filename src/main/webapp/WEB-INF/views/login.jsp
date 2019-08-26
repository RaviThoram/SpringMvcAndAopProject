<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h2>${message}</h2>
<form action="/loginprocess" method="post">
First name: <input type="text" name="userNameLog" ><br>
Last name: <input type="password" name="passwordLog" ><br>
<input type="submit" value="Login">

</body>
</html>
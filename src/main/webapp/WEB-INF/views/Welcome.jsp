<%@ page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP </title>
</head>

<%
	Date date = new Date();
%>

<body>Welcome to my First JSP Program 
<div>
Current date is <%= date %>
</div>
<h1> Hello ${name} </h1>

<div>
Your Todos are

 <ol>
<c:forEach items="${todos}" var="todo">
 <li>${todo.name}</li> 
</c:forEach>
</ol>
</div>

</body>
</html>
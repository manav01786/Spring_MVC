<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Welcome to Your To-Do List</h1>
   
<a href="/tasks">here is ur all task</a>
       <!-- Add a new task -->
    <p>
        <a href="/tasks/add">Add a New Task</a>
    </p>

    <!-- Logout option -->
    <p>
        <a href="/logout">Logout</a>
    </p>
</body>
</html>
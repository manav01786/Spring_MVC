<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Corrected taglib URI -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>
</head>
<body>
	<h2>View Students</h2>

	<a href="/">Add New Student</a> <!-- This link should navigate to the page where new student form is provided -->
	<table border="1">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Course</th>
				<th>Timings</th>
			</tr>
		</thead>

		<tbody>
			<!-- Looping over the students list passed from the controller -->
			<c:forEach items="${students}" var="student" varStatus="index">
				<tr>
					<td>${index.count}</td> <!-- Displaying the serial number -->
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.gender}</td>
					<td>${student.course}</td>
					<td>${student.timings}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Tasks</title>
</head>
<body>
 

    <!-- Display tasks -->
    <h2>Your Tasks:</h2>
    <ul>
        <c:forEach var="task" items="${tasks}">
            <li>
                <b>Task Name:</b> ${task.uTaskName} <br>
                <b>Date:</b> ${task.uTaskDate} <br>
                <b>Timing:</b> ${task.uTasktimings} <br>
            </li>
            <br>
        </c:forEach>
    </ul>


</body>
</html>

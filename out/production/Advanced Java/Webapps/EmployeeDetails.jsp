<!DOCTYPE html>
<html>
<head>
<title>Employee Details</title>
</head>
<body>
<h1>Employee Details</h1>
<table border="1">
<tr>
<th>Employee ID</th>
<th>Employee Name</th>
<th>Date of Birth</th>
<th>Email</th>
<th>Joining Date</th>
</tr>
<c:forEach items="${employees}" var="employee">
<tr>
<td>${employee.employeeID}</td>
<td>${employee.employeeName}</td>
<td>${employee.dateOfBirth}</td>
<td>${employee.email}</td>
<td>${employee.joiningDate}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
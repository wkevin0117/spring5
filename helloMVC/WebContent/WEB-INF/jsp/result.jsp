<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Student Information</h2>
		<table border="1">
			<tr>
				<td>Name</td>
				<td>${student.name}</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${student.age}</td>
			</tr>
			<tr>
				<td>Id</td>
				<td>${student.id}</td>
			</tr>
		</table>
</body>
</html>
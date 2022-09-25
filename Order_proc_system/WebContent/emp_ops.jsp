<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Order Management page</title>
</head>
<body>
	
	<h1>Welcome Employee</h1>
	Logged-in Employee Id:
	<input type = "text" value=${Employee.employeeId}>
	<br><br>
	<h4> Logged in Time is <span id="time"> </span></h4>
	<script>
	var datetime = new Date();
	console.log(datetime);
	document.getElementById("time").textContent = datetime;
	
	
	</script>
	
	<a href ="orderdetails">Order Details</a><br><br>
	<a href="CreateQuote.html">create new quote</a><br><br>
	<a href="ImportProducts.html">Import Products</a><br><br>
</body>
</html>
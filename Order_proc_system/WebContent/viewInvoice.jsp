<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Invoice is ready</title>
</head>
<body>
<h3>Requested Invoice has been Generated</h3>
	Invoice Id:
	<input type = "text" value=${Invoice.invoiceId}><br><br>
	Invoice Date:
	<input type = "text" value=${Invoice.invoice_date}><br><br>
	Invoice Order Id:
	<input type = "number" value=${Invoice.orderId}><br><br>
	Invoiced product:
	<input type = "text" value=${Invoice.product}><br><br>
	Invoice GST Type:
	<input type = "text" value=${Invoice.typeOfGST}><br><br>
	Total GST Amount:
	<input type = "text" value=${Invoice.GSTamount}><br><br>
	Invoice amount:
	<input type = "text" value=${Invoice.invoiceAmount}><br><br>
	Invoice status:
	<input type = "text" value=${Invoice.status}><br><br>
	
	<p End of Statement>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>All Flights</title>
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-hover">
		<thead>
		<tr>
			<th>Flight Id</th>
			<th>Departure Date</th>
			<th>Arrival Date</th>
			<th>Departure Gate</th>
			<th>Arrival Gate</th>
			<th>Departure Terminal</th>
			<th>Arrival Terminal</th>
		</tr>
		</thead>
		<s:iterator value="flightList" var="flight">
			<tr>
				<td><s:property value="flightId" /></td>
				<td><s:property value="departureDate" /></td>
				<td><s:property value="arrivalDate" /></td>
				<td><s:property value="departureGate" /></td>
				<td><s:property value="arrivalGate" /></td>
				<td><s:property value="departureTerminal" /></td>
				<td><s:property value="arrivalTerminal" /></td>
			</tr>
		</s:iterator>

	</table>

</body>
</html>
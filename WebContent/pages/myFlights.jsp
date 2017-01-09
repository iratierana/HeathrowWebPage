<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>My Flights</title>
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
</head>
<body>
	<table>
		<tr>
			<th>Flight Id</th>
			<th>Departure Date</th>
			<th>Arrival Date</th>
			<th>Departure Gate</th>
			<th>Arrival Gate</th>
			<th>Departure Terminal</th>
			<th>Arrival Terminal</th>
		</tr>
		<s:iterator value="myFlightList" var="flight">
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
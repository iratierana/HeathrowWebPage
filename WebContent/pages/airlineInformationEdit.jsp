<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Information</title>
</head>
<body>

<s:form action="airlineEditSave">
	<img><br><br>
	<s:textfield label="Serial Name" name="serial"></s:textfield><br>
	<s:textfield label="Airline Name" name="airlineName"></s:textfield><br><br>
	<table>
		<tr>
			<th>LON</th>
			<th>BI</th>
		</tr>
		<tr>
			<td>11:00</td>
			<td>13:30</td>
		</tr>
	</table><br>
	<s:textfield label="Number Of Flights" name="numberFlights"></s:textfield><br>
	<s:textfield label="Number Of Ours" name="numberOurs"></s:textfield><br><br>
	<s:text name="Description:"></s:text><br><s:textarea rows="6" cols="50"></s:textarea><br>
	
	<s:submit type="button">Save Changes</s:submit>
	
</s:form>

</body>
</html>
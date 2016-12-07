<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Book a Flight</title>
</head>
<body>
<s:form action="book" method="post">
		<s:textfield label="From" name="from"></s:textfield>
		<s:textfield label="To" name="to"></s:textfield>
		<s:textfield label="Departure" name="departure"></s:textfield>
		<s:textfield label="Arrival" name="arrival"></s:textfield>
		<s:textfield label="How Many" name="howMany"></s:textfield>
</s:form>

<s:form action="bookFlight" method="post">
	<s:submit id="book" value="Book" method="execute"></s:submit>
	<s:submit id="cancel" value="Cancel"></s:submit>
</s:form>
</body>
</html> 
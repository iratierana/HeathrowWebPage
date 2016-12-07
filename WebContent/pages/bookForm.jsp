<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Book Form</title>
</head>
<body>
<div id="bookFormDiv">
<s:form action="bookFlight" method="post">
		<s:textfield label="Name" name="name"></s:textfield><br>
		<s:textfield label="Surname 1" name="surname1"></s:textfield><br>
		<s:textfield label="Surname 2" name="surname2"></s:textfield><br>
		<s:textfield label="DNI/Passport" name="dni_passport"></s:textfield><br>
		<s:textfield label="Birthday Date" name="birthday_date"></s:textfield><br>
		<s:textfield label="Home Tlf" name="homeTlf"></s:textfield><br>
		<s:textfield label="Movile Tlf" name="movileTlf"></s:textfield><br>
		<s:textfield label="E-mail" name="email"></s:textfield><br>
</s:form>

<s:form action="bookCA" method="post">
	<s:submit id="bNext" value="Next Step" method="execute"></s:submit>
	<s:submit id="Cancel" value="Cancel"></s:submit>
</s:form>

</div>
</body>
</html> 
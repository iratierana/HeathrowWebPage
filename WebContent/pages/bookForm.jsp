<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Book Form</title>
<link rel="stylesheet" href="css/bookForm.css"/>
</head>
<body>
<div id="bookFormDiv">
<s:form action="bookFlight" method="post">
		<s:textfield label="Name" name="name"></s:textfield>
		<s:textfield label="Surname 1" name="surname1"></s:textfield>
		<s:textfield label="Surname 2" name="surname2"></s:textfield>
		<s:textfield label="DNI/Passport" name="dni_passport"></s:textfield>
		<s:textfield label="Birthday Date" name="birthday_date"></s:textfield>
		<s:textfield label="Home Tlf" name="homeTlf"></s:textfield>
		<s:textfield label="Movile Tlf" name="movileTlf"></s:textfield>
		<s:textfield label="E-mail" name="email"></s:textfield>
</s:form>

<s:form action="bookCA" method="post">
	<s:submit id="bNext" value="Next Step" method="execute"></s:submit>
	<s:submit id="Cancel" value="Cancel"></s:submit>
</s:form>

</div>
</body>
</html> 
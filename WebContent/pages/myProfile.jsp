<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Profile</title>
</head>
<body>
<header>
<h1>My Profile</h1>
</header>
<div id="profileDiv">
<s:form action="myProfile" method="post">
	<s:textfield label="First Name" name="firstName"></s:textfield>
	<s:textfield label="Last Name 1" name="lastName1"></s:textfield>
	<s:textfield label="Last Name 2" name="lastName2"></s:textfield>
	<s:textfield label="DNI/Passport" name="dniPassport"></s:textfield>
	<s:textfield label="Birthday Date" name="birthdayDate"></s:textfield>
	<s:textfield label="Home Tlf" name="homeTlf"></s:textfield>
	<s:textfield label="Movile Tlf" name="movileTlf"></s:textfield>
	<s:textfield label="E-mail" name="email"></s:textfield>
	
</s:form>

<s:form action="changeProfile" method="post">
	<s:submit id="change" value="Change" method="execute"></s:submit>
	<s:submit id="cancel" value="Cancel"></s:submit>
</s:form>

</div>
</body>
</html> 
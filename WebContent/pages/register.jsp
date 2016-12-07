<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register</title>
</head>
<body>
<header>
<h1>Sign Up</h1>
</header>
<div id="signUpDiv">
<s:form action="register" method="post">
	<div class="userPassLogin">
		<s:textfield label="First Name" name="firstName"></s:textfield>
		<s:textfield label="Last Name 1" name="lastName1"></s:textfield>
		<s:textfield label="Last Name 2" name="lastName2"></s:textfield>
		<s:textfield label="DNI/Passport" name="dni_passport"></s:textfield>
		<s:textfield label="Birthday Date" name="birthday_date"></s:textfield>
		
	</div>
</s:form>

<s:form action="register2" method="post">
	<s:submit id="bNext" value="Next Step" method="execute"></s:submit>
</s:form>

</div>
</body>
</html> 
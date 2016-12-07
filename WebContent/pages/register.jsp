<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register</title>
</head>
<body>
<header>
<h1>Register 1</h1>
</header>
<div id="signUpDiv">
<s:form action="register" method="post">
	<div class="userPassLogin">
		<s:label>First Name: </s:label>
		<s:textfield name="firstName"></s:textfield>
		
		<s:label>Last Name 1: </s:label>
		<s:textfield name="lastName1"></s:textfield>
		
		<s:label>Last Name 2</s:label>
		<s:textfield name="lastName2"></s:textfield>
		
		<s:label>DNI/Passport</s:label>
		<s:textfield  name="dni_passport"></s:textfield>
		
		<s:label>Birthday Date</s:label>
		<s:textfield name="birthday_date"></s:textfield>
		
		<s:submit id="bNext" value="Next Step" method="execute"></s:submit>
		
	</div>
</s:form>

	


</div>
</body>
</html> 
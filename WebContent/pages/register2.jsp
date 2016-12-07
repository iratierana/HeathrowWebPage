<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register2</title>
<link rel="stylesheet" href="css/register.css"/>
</head>
<body>
<header>
<h1>Sign Up</h1>
</header>
<div id="signUpDiv">
<s:form action="register2" method="post">
	<div class="userPassLogin">
		<s:textfield label="Home Tlf" name="homeTlf"></s:textfield>
		<s:textfield label="Moviel Tlf" name="movileTlf"></s:textfield>
		<s:textfield label="E-mail" name="email"></s:textfield>
	</div>
</s:form>

<s:form action="register3" method="post">
	<s:submit id="bNext" value="Next Step" method="execute"></s:submit>
</s:form>

</div>
</body>
</html> 
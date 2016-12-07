<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register3</title>
<link rel="stylesheet" href="css/register.css"/>
</head>
<body>
<header>
<h1>Sign Up</h1>
</header>
<div id="signUpDiv">
<s:form action="register3" method="post">
	<div class="userPassLogin">
		<s:textfield label="Username" name="username"></s:textfield>
		<s:password label="Password" name="password"></s:password>
		<s:password label="Repeat Password" name="repeatPassword"></s:password>
	</div>
</s:form>

<s:form action="login" method="post">
	<s:submit id="bNext" value="Log in" method="execute"></s:submit>
</s:form>

</div>
</body>
</html> 
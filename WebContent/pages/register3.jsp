<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register3</title>
</head>
<body>
<header>
<h1>Register 3</h1>
</header>
<div id="signUpDiv">
<s:form action="register3" method="post">
	<div class="userPassLogin">
		<s:label>Username: </s:label>
		<s:textfield label="Username" name="username"></s:textfield>
		
		<s:label>Password: </s:label>
		<s:password name="password"></s:password>
		
		<s:label>Repeat Password: </s:label>
		<s:password name="repeatPassword"></s:password>
		
		<s:submit id="bNext" value="Register" method="execute"></s:submit>
	</div>
</s:form>
</div>
</body>
</html> 
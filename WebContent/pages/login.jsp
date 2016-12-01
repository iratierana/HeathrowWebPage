<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
<link rel="stylesheet" href="css/login.css"/>
</head>
<body>
<div id="loginDiv">
<h1>Login</h1>
<s:form action="login" method="post">
	<div id="userPassLogin">
	<s:textfield label="Username" name="username"></s:textfield>
	<s:password label="Password" name="password"></s:password>
	<s:submit label="login" method="execute"></s:submit>
	</div>
</s:form>
</div>
</body>
</html> 
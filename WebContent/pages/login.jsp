<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Heathrow Airport</title>
  <link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
  <link rel="stylesheet" type="text/css" href="<s:url value="/css/loginStyle.css"/>">

</head>

<body>
  <div class="body"></div>
		<div class="header">
			<div>Heathrow<br><span>Airport</span></div>
		</div>
		<br>
		<s:form action="login" method="post">
			<div class="login">
					<s:textfield label="Username" name="username" placeholder="Username"></s:textfield>
					<s:password label="Password" name="password" placeholder="Password"></s:password><br>
					<s:submit value="Log In" method="execute"></s:submit>
					<s:submit value="Sign Up" method="register"></s:submit>
			</div>
		</s:form>  
</body>
</html>



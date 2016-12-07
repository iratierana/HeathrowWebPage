<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register2</title>
</head>
<body>
	<header>
	<h1>Register 2</h1>
	</header>

	<s:form action="register2" method="post">
		<s:label>Home Tlf: </s:label>
		<s:textfield name="homeTlf"></s:textfield>
		
		<s:label>Movile Tlf: </s:label>
		<s:textfield name="movileTlf"></s:textfield>
		
		<s:label>E-mail: </s:label>
		<s:textfield name="email"></s:textfield>		
		<s:submit id="bNext" value="Next Step" method="execute"></s:submit>
	
	</s:form>
</body>
</html> 
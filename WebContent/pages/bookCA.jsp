<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Book Form</title>
</head>
<body>
<div id="bookFormDiv">
<s:form action="bookCA" method="post">
		<s:textfield label="CA" name="ca"></s:textfield>
</s:form>

<s:form action="book" method="post">
	<s:submit id="book" value="Book" method="bookFlight"></s:submit>
	<s:submit id="Cancel" value="Cancel"></s:submit>
</s:form>

</div>
</body>
</html> 
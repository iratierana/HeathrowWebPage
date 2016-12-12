<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Manager</title>
</head>
<body>
	<div>
		<s:a action="airlineInformation">Iberia</s:a>
	</div>
	<div>
		<s:a action="airlineInformation">Lufthansa</s:a>
	</div>
	<div>
		<s:a action="airlineInformation">Turkish Airlines</s:a>
	</div>
</body>
</html>
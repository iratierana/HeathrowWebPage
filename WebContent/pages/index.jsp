<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Loading...</title>
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/loadingPage.css"/>">
	<meta name="viewport" content="width=device-width, initial-scale=1" />

</head>
<body>

	<div class="circle">
		<div class="borderCircle"></div>
		<div class="borderCircle2"></div>
		<div class="borderCircle3"></div>
		<div class="innerCircle">
		   <p>Loading...</p>
		 </div>
		<div class="outerCirlce"></div>
	</div>
	
	<script type="text/javascript">
		window.location.href = "firstAction.action"
	</script>
	
</body>
</html>






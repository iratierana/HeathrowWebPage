<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Manager</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
	body{
		margin:50px;
	}
</style>
</head>
<body>

<s:form action="airlineInformation">

<div class="list-group" style="max-height:500px; overflow:auto;">
	
	<s:iterator value="airplaneList" var="airplane">
	
		<s:a href="#" class="list-group-item">
		
		    <h2 class="list-group-item-heading" style="font-size:30px; font-weight:bold;"<s:property value="name"/>></h2><br>
		    <span class="list-group-item-heading" style="font-size:25px;"<s:property value="serialNumb"/>></span>
		    <span class="pull-right">
			    <s:submit type="button" class="btn btn-primary btn-lg">Info</s:submit>
			    <s:submit type="button" class="btn btn-primary btn-lg">Edit</s:submit>
			    <s:submit type="button" class="btn btn-primary btn-lg">Delete</s:submit>
		  	</span>
		  	
		 </s:a>
		 
	 </s:iterator>

	
</div>
</s:form>
</body>
</html>
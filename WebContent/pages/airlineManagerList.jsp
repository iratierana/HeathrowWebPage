<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Airline Manager</title>
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
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

<!--<s:form action="airlineInformation">-->

<div class="list-group" style="max-height:500px; overflow:auto;">
	
	<s:iterator value="airplaneList" >
		<s:a href="#" class="list-group-item">			
		    <span class="list-group-item-heading" style="font-size:30px; font-weight:bold;"><s:property value="name"/></span><br>
		    <span class="list-group-item-heading" style="font-size:25px;"><s:property value="serialNumb"/></span>
		    <span class="button-group pull-right">
		    	<s:form action="airlineInformation" style=" display:inline!important;">
		    		<s:hidden  name="airplaneId"></s:hidden>
			    	<s:submit type="button" class="btn icon-btn btn-info btn-md glyphicon btn-glyphicon glyphicon-info-sign img-circle text-info">Info</s:submit>
			    </s:form>
			    <s:form action="airlineEdit" style=" display:inline!important;">
			    	<s:hidden  name="airplaneId"></s:hidden>
			    	<s:submit type="button" class="btn icon-btn btn-warning btn-md glyphicon btn-glyphicon glyphicon-edit img-circle text-warning" method="execute">Edit</s:submit>
			    </s:form>
			    <s:form action="deleteAirplane" style=" display:inline!important;">
			   		<s:hidden  name="airplaneId"></s:hidden>
			    	<s:submit type="button" class="btn icon-btn btn-danger btn-md glyphicon btn-glyphicon glyphicon-trash img-circle text-danger">Delete</s:submit>
			    </s:form>
			   
		  	</span>
		 </s:a>
	</s:iterator> 	
</div>


<!-- <div class="list-group" style="max-height:500px; overflow:auto;">

	<s:iterator value="airplaneList" var="airplane">
		<span class="list-group-item-heading" style="font-size:30px; font-weight:bold;"<s:property value="airplane.name" default="a default value"/>></span><br>
		<span class="list-group-item-heading" style="font-size:25px;"<s:property value="serialNumb"/>></span>
		
		<span class="pull-right">
  			<button type="button" class="btn btn-primary">Info</button>
  			<button type="button" class="btn btn-primary">Edit</button>
  			<button type="button" class="btn btn-primary">Delete</button>
		</span>

	</s:iterator>
	
</div> -->

<!--  <table class="table table-hover">
		<tr>
			<th>Name</th>
			<th>Serial Number</th>
			<th>Info</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
<s:iterator value="airplaneList" var="airplane">
    <tr>
      <td>
   		<s:property value="name"/>
      </td>
      <td><s:property value="serialNumb"/></td>
      <td><s:submit type="button" class="btn btn-primary btn-lg">Info</s:submit></td>
      <td><s:submit type="button" class="btn btn-primary btn-lg">Edit</s:submit></td>
      <td><s:submit type="button" class="btn btn-primary btn-lg">Delete</s:submit></td>
    </tr>
</s:iterator>
</table>-->
<!--</s:form>-->
</body>
</html>
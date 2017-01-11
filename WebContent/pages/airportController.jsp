<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title>Airport Controller</title>
<script src="https://d3js.org/d3.v4.js"></script>
<script type="text/javascript" src="<s:url value="/js/map.js"></s:url>"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDwuZ3ePs3WL7qUBn1zVerSGTenwPCtQWs&callback=initMap"
        async defer></script>
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
<link rel="stylesheet" type="text/css" href="<s:url value="/css/airportControllerStyle.css"/>">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<!-- <h2>Welcome, <s:property value="username" />...!</h2> -->
	<aside class="well well-md">
		<img alt="Airplane photo" src="https://thumbs.dreamstime.com/t/handelspassagierflugzeug-whrend-des-fluges-67048953.jpg"><hr>
		<label>Serial : </label><s:textfield class="form-control" name="serialNumb" readonly="true"></s:textfield><br>
		<label>Airline : </label><s:textfield class="form-control" name="airlineName" readonly="true"></s:textfield><hr>
		
		<!-- Hemen ruta joango da -->
		
		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th style="text-align:center;">Departure</th>
					<th style="text-align:center;">Arrival</th>
				</tr>
			</thead>
			<tr>
				<td><s:property value="departureDate"/></td>
				<td><s:property value="arrivalDate"/></td>
			</tr>
		</table><hr>
		
		<label>Terminal : </label><s:textfield name="terminal" class="form-control" readonly="true"></s:textfield>
		<label>Gate : </label><s:textfield name="gate" class="form-control" readonly="true"></s:textfield><hr>
		
		<button type="button" class="btn btn-default btn-md">
			<span class="glyphicon glyphicon-calendar"></span>Flight from a specific day				
		</button>
	
	</aside>
	
	<section>
	<s:div id="map"></s:div>
	</section>
</body>
</html>
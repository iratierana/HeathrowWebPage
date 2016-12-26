<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
<script type="text/javascript" src="<s:url value="/js/map.js"></s:url>"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDwuZ3ePs3WL7qUBn1zVerSGTenwPCtQWs&callback=initMap"
        async defer></script>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/airportControllerStyle.css"/>">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<!-- <h2>Welcome, <s:property value="username" />...!</h2> -->
	<aside>
		<img src=""><hr>
		Serial: <s:textfield name="serialNumb" readonly="true"></s:textfield><br>
		Airline: <s:textfield name="airlineName" readonly="true"></s:textfield><hr>
		
		<!-- Hemen ruta joango da -->
		
		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th>Departure</th>
					<th>Arrival</th>
				</tr>
			</thead>
			<tr>
				<td><s:property value="departureDate"/></td>
				<td><s:property value="arrivalDate"/></td>
			</tr>
		</table><hr>
		
		Terminal: <s:textfield name="terminal" readonly="true" style=""></s:textfield>
		Gate: <s:textfield name="gate" readonly="true"></s:textfield><hr>
		
		<button type="button" class="btn btn-default btn-md">
			<span class="glyphicon glyphicon-calendar"></span>Flight from a specific day				
		</button>
		
		<!-- div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information table-hover">
                    <tbody>
                      <tr>
                        <td>Serial Number:</td>
                        <td><s:textfield name="serialNumb" readonly="true"></s:textfield> </td>
                        <td>Airline Name:</td>
                        <td><s:textfield name="airlineName" readonly="true"></s:textfield> </td>
                      </tr>
                      <tr>
                      </tr>
                      <tr>
                        <td>Route</td>
                        <td><s:textfield name="route" readonly="true"></s:textfield> </td>
                      </tr>
                      <tr>
                      	<td>Terminal:</td>
                      	<td><s:textfield name="terminal" readonly="true"></s:textfield> </td>
                      	<td>Gate:</td>
                      	<td><s:textfield name="gate" readonly="true"></s:textfield> </td>
                      </tr>
                      <tr>
                        <td><s:submit type="button" class="btn btn-default btn-md">
							<span class="glyphicon glyphicon-calendar"></span>Flight from a specific day				
						</s:submit></td>
                      </tr>
                                           
                    </tbody>
                  </table>
                </div>-->
		
	</aside>
	
	<section>
	<s:div id="map"></s:div>
	</section>
</body>
</html>
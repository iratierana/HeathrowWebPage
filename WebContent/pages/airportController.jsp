<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title>Airport Controller</title>
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="https://cdn.socket.io/socket.io-1.4.5.js"></script>
	<script type="text/javascript" src="<s:url value="/js/ajaxRefresh.js"></s:url>"></script>
	<script type="text/javascript" src="<s:url value="/js/positionMapper.js"></s:url>"></script>
	<script type="text/javascript" src="<s:url value="/js/map.js"></s:url>"></script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDwuZ3ePs3WL7qUBn1zVerSGTenwPCtQWs&callback=initMap" async defer></script>
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/airportControllerStyle.css"/>">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>

<body>
	
	<aside>
		<s:form action="idSearcher" method="post" class="form-group">
			<label>Airplane ID : </label><s:textfield type="number" class="form-control" name="airplaneId" readonly="false"></s:textfield><br>
			<label>Flight ID : </label><s:textfield type="number" class="form-control" name="flightId" readonly="false"></s:textfield><br>
			<input id="button" type="button" class="btn btn-default btn-md glyphicon glyphicon-search" value="Submit"/><hr>
			<input type="hidden" value="idFlight">
		</s:form>
			
		<div id="aside"></div>
	</aside>

	
	<section >
	<s:div id="map"></s:div>
	</section>
	
</body>
</html>
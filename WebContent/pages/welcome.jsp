<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
<script type="text/javascript" src="../js/map.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDwuZ3ePs3WL7qUBn1zVerSGTenwPCtQWs&callback=initMap"
        async defer></script>
</head>

<body>
	<h2>Welcome, <s:property value="username" />...!</h2>
	<s:div id="map" style="height: 500px;width: 100%;"></s:div>
</body>
</html>
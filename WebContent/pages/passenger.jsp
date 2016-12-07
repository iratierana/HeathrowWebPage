<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Passenger Page</title>
</head>
<body>
<nav id="passengerNav">
	<s:a href="bookFlight.jsp" name="book"><img src="../img/book.png"><br>Book a Flight</s:a>
	<s:a name="myFlights"><img src="../img/myFlights.png"><br>My Flights</s:a>
	<s:a name="allFlights"><img src="../img/allFlights.png"><br>All Flights</s:a>
	<s:a name="myProfile"><img src="../img/profile.png"><br>My Profile</s:a>
</nav>
</body>
</html> 
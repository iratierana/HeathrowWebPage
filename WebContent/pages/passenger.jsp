<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Passenger Page</title>
<link rel="stylesheet" href="../css/passengerStyle.css"></head>
<body>
	<header>
		<h1>Menu</h1>
	</header>
	<nav>
		<ul>		
			<li>
				<div>
					<s:a action="bookAFlight">Book a Flight</s:a>
					<img src="../img/book.png">
				</div>
				
			</li>			
			<li>
				<div>	
					<s:a action="myFlights">My Flights</s:a>
					<img src="../img/myFlights.png">
				</div>
			</li>			
			<li>
				<div>
					<s:a action="allFlights">All Flights</s:a>
					<img src="../img/allFlights.png">
				</div>
			</li>			
			<li>
				<div>
					<s:a action="myProfile">My Profile</s:a>
					<img src="../img/profile.png">
				</div>
			</li>	
				
		</ul>
	</nav>
	
</body>
</html> 
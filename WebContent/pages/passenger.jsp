<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title>Passenger Page</title>
<link rel="stylesheet" href="<s:url value="/css/passengerStyle.css"/>">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
</head>
<body>
	<nav>
		<ul>		
			<li>
				<div>
					<s:a action="bookAFlight">Book a Flight</s:a>
					<i class="fa fa-credit-card" aria-hidden="true"></i>
				</div>
				
			</li>			
			<li>
				<div>	
					<s:a action="myFlights">My Flights</s:a>
					<i class="fa fa-suitcase" aria-hidden="true"></i>
				</div>
			</li>			
			<li>
				<div>
					<s:a action="allFlights">All Flights</s:a>
					<i class="fa fa-plane " aria-hidden="true"></i>
				</div>
			</li>			
			<li>
				<div>
					<s:a action="myProfile">My Profile</s:a>
					<i class="fa fa-user " aria-hidden="true"></i>
				</div>
			</li>	
				
		</ul>
	</nav>
	
</body>
</html> 
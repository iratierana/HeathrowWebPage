<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<title>Book a Flight</title>
	<link rel="stylesheet" type="text/css" href="<s:url value="/css/bookingAndRegisterStyle.css"/>">
	<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
	<script type="text/javascript" src="<s:url value="/js/bookingSteps.js"/>"></script>
	
		<style type="text/css">
		label{
			font-size:13px;
			font-family: montserrat, arial, verdana;
		}
	</style>
</head>
<body>

	<s:form action="finishBookingAFlight" method="post" id="msform">
	
		<div class="col--12">
			<ul id="progressbar">
				<li id="pb1" class="active">Select flight</li>
				<li id="pb2">Personal data</li>
				<li id="pb3">Contact data</li>
				<li id="pb4">Payment</li>
			</ul>
			<!-- fieldsets -->
			<fieldset id="step1">
				<h2 class="fs-title">Select flight</h2>	
				<s:textfield name="from" placeholder="From(Origin)"></s:textfield>		
				<s:textfield name="to" placeholder="To(Destination)"></s:textfield>	
				<label>Departure: </label><s:textfield type="date" name="departureDay" ></s:textfield>	
				<label>Arrival: </label><s:textfield type="date" name="arrivalDay"></s:textfield>	
				<s:textfield type="number" name="numberOfPassangers" placeholder="Number Of Passangers"></s:textfield>	
				<input type="button" name="next" class="next action-button" value="Next" onclick="goToStep2()" />
			</fieldset>
			<fieldset id="step2" class="hideme">
				<h2 class="fs-title">Personal data</h2>
				<s:textfield name="name" placeholder="Name"></s:textfield>
				<s:textfield name="firstName" placeholder="First Name"></s:textfield>
				<s:textfield name="secondName" placeholder="Second Name"></s:textfield>
				<s:textfield name="dniPassport" placeholder="Dni/Passport"></s:textfield>
				<label>Birth Date: </label><s:textfield type="date" name="birthDate"></s:textfield>
				<input type="button" name="previous" class="previous action-button"	value="Previous" onclick="goToStep1()" />
				<input type="button" name="next" class="next action-button" value="Next" onclick="goToStep3()"/>
			</fieldset>
			<fieldset id="step3" class="hideme">
				<h2 class="fs-title">Contact data</h2>
				<s:textfield name="homeTlf" placeholder="Home Tlf"></s:textfield>
				<s:textfield name="movileTlf" placeholder="Movile Tlf"></s:textfield>
				<s:textfield name="email" placeholder="E-Mail"></s:textfield>
				
				<input type="button" name="previous" class="previous action-button"	value="Previous" onclick="goToStep2()" />
				<input type="button" name="next" class="next action-button" value="Next" onclick="goToStep4()"/>			
				
			</fieldset>
			<fieldset id="step4" class="hideme">
				<h2 class="fs-title">Payment</h2>
				<s:textfield name="ca" placeholder="Account Number"></s:textfield>
				<input type="button" name="previous" class="previous action-button"	value="Previous" onclick="goToStep3()"/>			
				
				<s:submit value="Submit" method="execute" class="submit action-button"></s:submit>
			</fieldset>
			
		</div>
	</s:form>

</body>
</html>

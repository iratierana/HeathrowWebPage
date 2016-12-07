<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Register</title>
	<link rel="stylesheet" type="text/css" href="../css/registrationStyle.css">
	<script src="../js/registerSteps.js" type="text/javascript"></script>
</head>
<body>

	<s:form action="register" method="post" id="msform">
	
		<ul id="progressbar">
			<li id="pb1" class="active">Account Setup</li>
			<li id="pb2">Social Profiles</li>
			<li id="pb3">Personal Details</li>
		</ul>
		<!-- fieldsets -->
		<fieldset id="step1">
			<h2 class="fs-title">User data</h2>
			<s:textfield name="name" placeholder="Name"></s:textfield>
			<s:textfield name="firstName" placeholder="First Name"></s:textfield>
			<s:textfield name="secondName" placeholder="Second Name"></s:textfield>
			<s:textfield name="dniPassport" placeholder="Dni/Passport"></s:textfield>
			<s:textfield name="birthDate" placeholder="Birth Date"></s:textfield>
			<input type="button" name="next" class="next action-button" value="Next" onclick="goToStep2()" />
		</fieldset>
		<fieldset id="step2" class="hideme">
			<h2 class="fs-title">Contact</h2>
			<s:textfield name="homeTlf" placeholder="Home Tlf"></s:textfield>
			<s:textfield name="movileTlf" placeholder="Movile Tlf"></s:textfield>
			<s:textfield name="email" placeholder="E-Mail"></s:textfield>
			<input type="button" name="previous" class="previous action-button"	value="Previous" onclick="goToStep1()" />
			<input type="button" name="next" class="next action-button" value="Next" onclick="goToStep3()"/>
		</fieldset>
		<fieldset id="step3" class="hideme">
			<h2 class="fs-title">Account Details</h2>
			<s:textfield name="username" placeholder="Username"></s:textfield>
			<s:textfield name="password" placeholder="Password"></s:textfield>
			<s:textfield name="repPassword" placeholder="Repeat Password"></s:textfield>
			<input type="button" name="previous" class="previous action-button"	value="Previous" onclick="goToStep2()"/>
			
			<s:submit value="Submit" method="execute" class="submit action-button"></s:submit>
		</fieldset>
	</s:form>

</body>
</html>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Heathrow Airport</title>
  <link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
  <link rel="stylesheet" type="text/css" href="<s:url value="/css/loginStylee.css"/>">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
  <script type="text/javascript" src="<s:url value="/js/Chart.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/js/histogram.js"/>"></script>
</head>

<body>
 <!--   <div class="body"></div>
		<div class="header">
			<div>Heathrow<br><span>Airport</span></div>
		</div>
		<br>
		<s:form action="login" method="post">
			<div class="login">
					<s:textfield label="Username" name="username" placeholder="Username"></s:textfield>
					<s:password label="Password" name="password" placeholder="Password"></s:password><br>
					<s:submit value="Log In" method="execute"></s:submit>
					<s:submit value="Sign Up" method="register"></s:submit>
			</div>
		</s:form>  -->



<div class="container">
  
  <div class="row" id="pwd-container">
    <div></div>
    
    <div class="col-md-4">
      <section class="login-form">
        <form method="post" action="login" role="login">
          <img src="<s:url value="/img/GestAir.png"/>" class="img-responsive" alt="" />    
          <s:textfield label="Username" name="username" placeholder="Username" class="form-control input-lg"/>
          <s:password label="Password" name="password" class="form-control input-lg" id="password" placeholder="Password"/>
          
          <div class="pwstrength_viewport_progress"></div>
          
          <s:submit value="Log In" method="execute" class="btn btn-lg btn-primary btn-block"></s:submit>
          <s:submit value="Sign Up" method="register" class="btn btn-lg btn-primary btn-block"></s:submit>
                   
        </form>
     
      </section>  
      </div>
      
      <div class="col-md-8">
      
      <div id="graphs">
			<div class="histogram">
				<canvas id="myChart"></canvas>
				<script type="text/javascript">
      				paintHistogram();
    			</script>
			</div>
	  </div>
      
      	<s:div id="table">
			<table class="table table-hover">
			<thead>
				<tr>
					<th>Flight Id</th>
					<th>Departure Date</th>
					<th>Arrival Date</th>
					<th>Departure Gate</th>
					<th>Arrival Gate</th>
					<th>Departure Terminal</th>
					<th>Arrival Terminal</th>
				</tr>
			</thead>
			<s:iterator value="flightList" var="flight">
			<tbody>
				
				<tr>
					<td><s:property value="flightId" /></td>
					<td><s:property value="departureDate" /></td>
					<td><s:property value="arrivalDate" /></td>
					<td><s:property value="departureGate" /></td>
					<td><s:property value="arrivalGate" /></td>
					<td><s:property value="departureTerminal" /></td>
					<td><s:property value="arrivalTerminal" /></td>
				</tr>
			</tbody>
			</s:iterator>

			</table>
		</s:div>
      
      </div>
      

  </div>
 
</div>

<!--<section>
	<s:div id="table">
		<table class="table table-hover">
	<thead>
		<tr>
			<th>Flight Id</th>
			<th>Departure Date</th>
			<th>Arrival Date</th>
			<th>Departure Gate</th>
			<th>Arrival Gate</th>
			<th>Departure Terminal</th>
			<th>Arrival Terminal</th>
		</tr>
	</thead>
		<s:iterator value="flightList" var="flight">
			<tbody>
			<tr>
				<td><s:property value="flightId" /></td>
				<td><s:property value="departureDate" /></td>
				<td><s:property value="arrivalDate" /></td>
				<td><s:property value="departureGate" /></td>
				<td><s:property value="arrivalGate" /></td>
				<td><s:property value="departureTerminal" /></td>
				<td><s:property value="arrivalTerminal" /></td>
			</tr>
			</tbody>
		</s:iterator>

	</table>
	</s:div>
</section>-->

</body>
</html>


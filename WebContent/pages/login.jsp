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
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" src="<s:url value="/js/lineDiagram.js"/>"></script>
  <script src="https://code.highcharts.com/highcharts.js"></script>
  <script src="https://code.highcharts.com/modules/exporting.js"></script>
  
</head>

<body>

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
				<div id="dataDiagram" style="min-width: 700px; height: 250px; margin: 0 auto"></div>				
			</div>
	  </div>
      
      	<s:div id="table" style="height: 215px; overflow-y: scroll;">
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

</body>
</html>


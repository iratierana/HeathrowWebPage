<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Airline Information</title>
<link rel="shortcut icon" href="/HeathrowWebPage/img/pageIcon.png">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style type="text/css">
	.col-md-3 col-lg-3{
		align:center;
	}
	
	body{
		background-image: url(https://newevolutiondesigns.com/images/freebies/city-wallpaper-18.jpg);
		background-size: cover;	
	}
</style>
</head>
<body>

	 <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" style="margin-top:60px;">
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">Airplane Information</h3>
            </div>
            <div class="panel-body">
              <div class="row">
              	<div class="col-md-3 col-lg-3 "> 
              		<img alt="Plane Pic" src=<s:property value="pString"/> class="img-circle img-responsive">
              	</div>
                
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information table-hover">
                    <tbody>
                      <tr>
                        <td>Airplane Name:</td>
                        <td><input type="text" name="airplaneName" value="pito" readonly="readonly" id="airplaneName"/> </td>
                      </tr>
                      <tr>
                        <td>Serial Number:</td>
                        <td><input type="text" name="serialNumber" value="58324" readonly="readonly" id="serialNumber"/> </td>
                      </tr>
                      <tr>
                        <td>Route</td>
                        <td><input type="text" name="route" value="***UNDEFINED***" readonly="readonly" id="route"/> </td>
                      </tr>
                      <tr>
                      	<td>Number Of Flights:</td>
                      	<td><input type="text" name="numberOfFlights" value="286" readonly="readonly" id="numberOfFlights"/> </td>
                      </tr>
                      <tr>
                        <td>Number Of Ours:</td>
                       <td><input type="text" name="numberOfOurs" value="1912" readonly="readonly" id="numberOfOurs"/> </td>
                      </tr>
                                           
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            
          </div>
        </div>
</body>
</html>
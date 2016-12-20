<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Information</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	 <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" style="margin-top:60px;">
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">Airplane Information</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png" class="img-circle img-responsive"> </div>
                
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information table-hover">
                    <tbody>
                      <tr>
                        <td>Airplane Name:</td>
                        <td>My JUJU</td>
                      </tr>
                      <tr>
                        <td>Serial Number:</td>
                        <td>ACJ120</td>
                      </tr>
                      <tr>
                        <td>Route</td>
                        <td>LON - BI</td>
                      </tr>
                      <tr>
                      	<td>Number Of Flights:</td>
                      	<td>123</td>
                      </tr>
                      <tr>
                        <td>Number Of Ours:</td>
                        <td>1234</td>
                      </tr>
                      <tr>
                        <td>Description:</td>
                        <td><s:textarea rows="5" cols="30" name="numberOurs" class="form-control input-md"></s:textarea></td>
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
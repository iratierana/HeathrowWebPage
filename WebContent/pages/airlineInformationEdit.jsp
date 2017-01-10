<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Airline Information Edit</title>
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
	.col-md-3 col-lg-3{
		align:center;
	}
</style>

</head>
<body>
	<s:form action="airplanesList">
	<s:hidden  name="airplaneId"></s:hidden>
	 <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" style="margin-top:60px;">
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">Airplane Information</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 "> <img alt="User Pic" src="https://media.licdn.com/mpr/mpr/AAEAAQAAAAAAAAMiAAAAJGVlYTU5Y2YyLWQwMzYtNDlmZS04MDdlLWI0ZjJjZWRhYjk4ZQ.jpg" class="img-circle img-responsive"> </div>
                
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information table-hover">
                    <tbody>
                      <tr>
                        <td>Airplane Name:</td>
                        <td><s:textfield name="airplaneName" readonly="false"></s:textfield> </td>
                      </tr>
                      <tr>
                        <td>Serial Number:</td>
                        <td><s:textfield name="serialNumber" readonly="false"></s:textfield> </td>
                      </tr>
                      <tr>
                        <td>Route</td>
                        <td><s:textfield name="route" readonly="true"></s:textfield> </td>
                      </tr>
                      <tr>
                      	<td>Number Of Flights:</td>
                      	<td><s:textfield name="numberOfFlights" readonly="true"></s:textfield> </td>
                      </tr>
                      <tr>
                        <td>Number Of Ours:</td>
                       <td><s:textfield name="numberOfOurs" readonly="true"></s:textfield> </td>
                      </tr>
                                           
                    </tbody>
                  </table>
                  	<s:submit type="button" class="btn icon-btn btn-success btn-md glyphicon btn-glyphicon glyphicon-floppy-disk img-circle text-success pull-right" method="execute">Save Changes</s:submit>
                </div>
              </div>
            </div>
            
          </div>
        </div>
       </s:form>
</body>
</html>
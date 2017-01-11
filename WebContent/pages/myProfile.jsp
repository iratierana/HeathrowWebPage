<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title>My Profile</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<link rel="shortcut icon" href="<s:url value="/img/pageIcon.png"/>">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
	body{
		background-image: url(https://newevolutiondesigns.com/images/freebies/city-wallpaper-18.jpg);
		background-size: cover;	
	}
	
	label{
		color:white;
		font-weight:bold;
		font-size:16px;
	}
	
	#divPrincipal{
		border-box: 0px 0px 0px 10px;
		background-image: url(../img/grisTransparente.png) no-repeat 0px 0px;
	}
</style>
</head>
<body>

	<div class="container" id="divPrincipal">
		<form action="myProfileSaveChanges" class="form-horizontal">
			<fieldset>

				<legend style="text-align:center; width:650px; ">My Profile</legend>

				<div class="form-group">
					<label class="col-md-4 control-label">Name</label>
					<div class="col-md-4">
						<s:textfield name="name" class="form-control input-md"></s:textfield>

					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label">Last
						Name 1</label>
					<div class="col-md-4">
						<s:textfield name="firstName" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label">Last
						Name 2</label>
					<div class="col-md-4">
						<s:textfield name="secondName" class="form-control input-md"></s:textfield>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label">Dni/Passport</label>
					<div class="col-md-4">
						<s:textfield name="dniPassport" class="form-control input-md"></s:textfield>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label">Birthday</label>
					<div class="col-md-4">
						<s:textfield type="date" name="birthDate" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label">Home Telephone</label>
					<div class="col-md-4">
						<s:textfield name="homeTlf" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label">Movile Telephone</label>
					<div class="col-md-4">
						<s:textfield name="movileTlf" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label">E-Mail</label>
					<div class="col-md-4">
						<s:textfield name="email" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label">Username</label>
					<div class="col-md-4">
						<s:textfield name="username" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label">Password</label>
					<div class="col-md-4">
						<s:textfield type="password" name="password" class="form-control input-md"></s:textfield>
					</div>
				</div>

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label"></label>
					<div class="col-md-4">
						<s:submit type="button" class="btn icon-btn btn-success btn-md glyphicon btn-glyphicon glyphicon-floppy-disk img-circle text-success pull-right" method="execute">Save Changes</s:submit>
					</div>
				</div>

			</fieldset>
		</form>

	</div>

</body>
</html>
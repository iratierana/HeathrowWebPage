<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Profile</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<form action="myProfileSaveChanges" class="form-horizontal">
			<fieldset>

				<legend>My Profile</legend>

				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Name</label>
					<div class="col-md-4">
						<s:textfield name="name" class="form-control input-md"></s:textfield>

					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Last
						Name 1</label>
					<div class="col-md-4">
						<s:textfield name="firstName" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Last
						Name 2</label>
					<div class="col-md-4">
						<s:textfield name="secondName" class="form-control input-md"></s:textfield>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Dni/Passport</label>
					<div class="col-md-4">
						<s:textfield name="dniPassport" class="form-control input-md"></s:textfield>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Birthday</label>
					<div class="col-md-4">
						<s:textfield type="date" name="birthDate" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Home Telephone</label>
					<div class="col-md-4">
						<s:textfield name="homeTlf" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Movile Telephone</label>
					<div class="col-md-4">
						<s:textfield name="movileTlf" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">E-Mail</label>
					<div class="col-md-4">
						<s:textfield name="email" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Username</label>
					<div class="col-md-4">
						<s:textfield name="username" class="form-control input-md"></s:textfield>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">Password</label>
					<div class="col-md-4">
						<s:textfield type="password" name="password" class="form-control input-md"></s:textfield>
					</div>
				</div>

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="singlebutton"></label>
					<div class="col-md-4">
						<s:submit  method="execute" value="Save Changes" class="btn btn-primary"></s:submit>						
					</div>
				</div>

			</fieldset>
		</form>

	</div>

</body>
</html>

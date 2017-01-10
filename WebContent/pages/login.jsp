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
          <img src="../img/GestAir.png" class="img-responsive" alt="" />
          <s:textfield label="Username" name="username" placeholder="Username" class="form-control input-lg"/>
          <s:password label="Password" name="password" class="form-control input-lg" id="password" placeholder="Password"/>
          
          <div class="pwstrength_viewport_progress"></div>
          
          <s:submit value="Log In" method="execute" class="btn btn-lg btn-primary btn-block"></s:submit>
          <s:submit value="Sign Up" method="register" class="btn btn-lg btn-primary btn-block"></s:submit>
                   
        </form>
     
      </section>  
      </div>
      
      <div class="col-md-8"></div>
      

  </div>
 
</div>

</body>
</html>


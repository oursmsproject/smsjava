<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@page session="true"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="language" content="en">
<!-- Bootstrap Core CSS -->
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/login.css">

<style>
.show-password-link {
	display: block;
	position: absolute;
	z-index: 11;
	background: url(images/psswrd_shwhide_icon.png) no-repeat;
	width: 18px;
	height: 12px;
	left: 212px !important;
}

.password-showing {
	position: absolute;
	z-index: 10;
}

.lw_right {
	float: right;
	height: 100%;
}

.lw_left {
	float: left;
	height: 100%;
}

.loginboxWrapper {
	display: flex;
	height: 100%;
}

.ip-blocked {
	padding: 113px 0px;
	width: 100%;
	text-align: center;
	font-size: 20px;
	color: red;
	font-weight: 600;
}
</style>
</head>
<body>
	<title>SMS</title>
	<div class="loginboxWrapper">
		<div class="lw_left">
			<div class="lw_logo">
				<img
					src="${pageContext.request.contextPath}/static/images/smsicon.jpg"
					height="161">
			</div>
		</div>
		<div class="lw_right">
			<h1>Login</h1>
			<p>Please fill out the following form with your login
				credentials:</p>
			<div id="page-wrapper">
				<div class="container">
					<div class="row">
						<div class="col-md-3" style="padding-left: 0px; margin-left: 0px;">
							<div class="login-panel panel panel-default">
								<div class="panel-body">
									<c:if test="${not empty error }">
										<div class="alert alert-success alert-dismissable">
											<button type="button" class="close" data-dismiss="alert"
												aria-hidden="true">&times;</button>
											${error}
										</div>
									</c:if>
									<c:if test="${not empty msg }">
										<div class="alert alert-success alert-dismissable">
											<button type="button" class="close" data-dismiss="alert"
												aria-hidden="true">&times;</button>
											${msg}
										</div>
									</c:if>
									<form role="form" name='loginForm' id='loginForm'
										action="<c:url value='/auth/login_check' />" method='POST'>
										<fieldset>
											<div class="form-group">
												<input class="form-control" placeholder="Username"
													name="username" type="text">
											</div>
											<div class="form-group"
												ng-class="{'has-error': loginForm.password.$error , 'has-success': loginForm.password.$msg}">
												<input class="form-control" placeholder="Password"
													name="password" type="password" value="">
											</div>
											<!-- Change this to a button or input when using this as a form -->
											<div class="form-group"
												style="width: 300px; padding-bottom: 0px; margin-bottom: 0px;">
												<div style="float: left; width: 80px; padding-right: 5px;">
													<input name="submit" type="submit"
														class="btn btn-primary btn-block" value="Login" />
												</div>
												<div style="float: right; width: 220px">
													<a href="#">Lost Password</a></br> <a href="#">New
														Registration</a>
												</div>
											</div>
										</fieldset>
										<input type="hidden" name="${_csrf.parameterName}"
											value="${_csrf.token}" />
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<div class="clear"></div>
	</div>
	<!-- jQuery -->
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<!-- Bootstrap -->
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	
</body>
</html>
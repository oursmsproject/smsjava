<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@page session="true"%>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SMS | </title>
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type='text/css'>
    <link href="${pageContext.request.contextPath}/static/css/daterangepicker.css" rel="stylesheet" type='text/css'>
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/static/css/font-awesome.min.css" rel="stylesheet" type='text/css'>
    <!-- iCheck -->
    <link href="${pageContext.request.contextPath}/static/css/green.css" rel="stylesheet">
    <!-- bootstrap-wysiwyg -->
    <link href="${pageContext.request.contextPath}/static/css/prettify.min.css" rel="stylesheet">
    <!-- Select2 -->
    <link href="${pageContext.request.contextPath}/static/css/select2.min.css" rel="stylesheet">
    <!-- Switchery -->
    <link href="${pageContext.request.contextPath}/static/css/switchery.min.css" rel="stylesheet">
    <!-- starrr -->
    <link href="${pageContext.request.contextPath}/static/css/starrr.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/static/css/custom.min.css" rel="stylesheet" type='text/css'>
    <link href="${pageContext.request.contextPath}/static/css/sweetalert.css" rel="stylesheet" type='text/css'>
     <!-- Datatables -->
    <link href="${pageContext.request.contextPath}/static/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/responsive.bootstrap.min.css" rel="stylesheet">
    <script>
		function logOut() {
			document.getElementById("logoutForm").submit();
		}
	</script>
</head>
<body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-university"></i> <span>SMS</span></a>
            </div>

            <div class="clearfix"></div>
            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="dashboard">Dashboard</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-cogs"></i> Settings <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">	
                      <li><a href="institutionSetUp">Institution Setup</a></li>
                      <li><a href="userRoleActionSetUp">User Roles Setup</a></li>
                      <li><a href="annualHolidaysSetup">Annual Holidays Setup</a></li>
                      <li><a href="courseSetUp">Course Setup</a></li>
                      <li><a href="batchSetUp">Batch Setup</a></li>
                      <li><a href="backupRestore">Backup/Restore</a></li>
                    </ul>
                  </li>
              </div>
              <div class="menu_section">
                <h3>Student</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-graduation-cap"></i> Manage Students <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="listStudent">Students List</a></li>
                      <li><a href="createStudent">Create New Student</a></li>
                      <li><a href="studentFieldSetting">Student Field Setting</a></li>
                      <li><a href="manageStudentCategory">Manage Student Category</a></li>
                      <li><a href="manageLogCategory">Manage Log Category</a></li>
					  <li><a>Student Leave Management<span class="fa fa-chevron-down"></span></a>
						  <ul class="nav child_menu">
							<li class="sub_menu"><a href="addLeaveType">Add Leave Type</a>
							</li>
						  </ul>
						</li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-users""></i> Manage Guardians <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="listGurdians">List Gurdians</a></li>
                    </ul>
                  </li>
				  <li><a><i class="fa fa-windows"></i> Online Registration <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="onlineApplications">Online Applicants</a></li>
                      <li><a href="approveStudents">Student Approval</a></li>
                      <li><a href="waitingListStudents">Waiting List</a></li>
                    </ul>
                  </li>            
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav class="" role="navigation">
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="${pageContext.request.contextPath}/static/images/img.jpg" alt="">Venu Boss
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <c:url value="/j_spring_security_logout" var="logoutUrl" />
					<form action="${logoutUrl}" method="post" id="logoutForm">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form>
                    <li><a href="javascript:logOut();"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">

	<title>ePERA</title>
	
	<!-- Custom fonts for this template-->
	<link href="${contextPath}/resources/template/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
	
	<!-- Custom styles for this template-->
	<link href="${contextPath}/resources/template/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

<%-- /////////////////////////////////////////////// Main Page (sidebar + topbar + main) /////////////////////////////////////////////// --%>
	<!-- Page Wrapper -->
	<div id="wrapper">
	
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Begin Page Content -->
				<div class="container-fluid">
				
					<br>
					<!-- Page Heading -->
					<div class="d-sm-flex align-items-center justify-content-between mb-4"></div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
					
						<div class="col-lg-2"></div>
						<div class="col-lg-8"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-4">
								<div class="card-header py-3 text-center">
									<h6 class="m-0 font-weight-bold text-primary">welcome to ePERA</h6>
								</div>
								<div class="card-body">
									<div class="text-center">
										<img class="img-fluid px-3 px-sm-4 mt-3 mb-4" style="width: 25rem;" src="${contextPath}/resources/template/img/undraw_posting_photo.svg" alt="">
									</div>
									<br>
									<div class="text-center">
								<form action="signInEmp.do" method="post">
										<div class="row">
											<div class="col-md-4"></div>
											<div class="col-md-4"><input type="text" name="account" required="required" class="form-control form-control-user" placeholder="account"></div>
											<div class="col-md-4"></div>
										</div>
										<br>
										<div class="row">
											<div class="col-md-4"></div>
											<div class="col-md-4"><input type="password" name="password" required="required" class="form-control form-control-user" placeholder="password"></div>
											<div class="col-md-4"></div>
										</div>
										<br>
										<div class="row">
											<div class="col-md-5"></div>
											<div class="col-md-2 text-center"><button type="submit" class="btn btn-primary btn-user btn-block">sign in</button></div>
											<div class="col-md-5"></div>
										</div>
								</form>
									</div>
								</div>
							</div>
							
						</div><!-- </div class="col-lg-8"> -->
						<div class="col-lg-2"></div>
					</div><!-- row -->

				</div><!-- </div class="container-fluid"> -->

			</div><!-- </div id="content"> -->

			</div><!-- </div id="content-wrapper" class="d-flex flex-column"> -->

	</div><!-- <div id="wrapper"> -->
	<!-- End of Page Wrapper -->
<%-- /////////////////////////////////////////////// /Main Page (sidebar + topbar + main) /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// commonScript /////////////////////////////////////////////// --%>
	<!-- Bootstrap core JavaScript-->
	<script src="${contextPath}/resources/template/vendor/jquery/jquery.min.js"></script>
	<script src="${contextPath}/resources/template/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	
	<!-- Core plugin JavaScript-->
	<script src="${contextPath}/resources/template/vendor/jquery-easing/jquery.easing.min.js"></script>
	
	<!-- Custom scripts for all pages-->
	<script src="${contextPath}/resources/template/js/sb-admin-2.min.js"></script>
	
	<!-- Page level plugins -->
	<script src="${contextPath}/resources/template/vendor/chart.js/Chart.min.js"></script>
	
	<!-- Page level custom scripts -->
	<script src="${contextPath}/resources/template/js/demo/chart-area-demo.js"></script>
	<script src="${contextPath}/resources/template/js/demo/chart-pie-demo.js"></script>
<%-- /////////////////////////////////////////////// /commonScript /////////////////////////////////////////////// --%>

	<script type="text/javascript">
		var msg = '${msg}';
		if(msg.length > 2){
			alert(msg);
		}
	</script>

</body>

</html>
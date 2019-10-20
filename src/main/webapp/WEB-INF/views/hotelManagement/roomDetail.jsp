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
	
		<!-- sidebar -->
		<jsp:include page="../../include/sidebar.jsp" />

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
     
     				<!-- topbar -->
				<jsp:include page="../../include/topbar.jsp" />

				<!-- Begin Page Content -->
				<div class="container-fluid">
				
					<!-- Page Heading -->
					<div class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Hotel Management</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<span class="text-danger font-weight-bold text-center">#${room.no}</span>
								</div>
								<div class="row">
									<div class="card-body">
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">floor</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">room-type</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">price</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-info text-center">${room.floor}F</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-info text-center">${room.type}</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-info text-center">
													<fmt:formatNumber value="${room.price}" pattern="#,###" />
												</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">king-bed</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">queen-bed</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">capacity</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
											<c:choose>
											<c:when test="${room.king eq 'Y'}">
												<span class="text-info text-center">${room.kBed} EA</span>
											</c:when>
											<c:otherwise>
												<span class="text-info text-center">0</span>
											</c:otherwise>
											</c:choose>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
											<c:choose>
											<c:when test="${room.queen eq 'Y'}">
												<span class="text-info text-center">${room.qBed} EA</span>
											</c:when>
											<c:otherwise>
												<span class="text-info text-center">0</span>
											</c:otherwise>
											</c:choose>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-info text-center">${room.capacity} person</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">etc</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center"></span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center"></span>
											</div>
										</div>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
											<c:choose>
											<c:when test="${room.smoking eq 'Y'}">
												<span class="text-info text-center">흡연실</span>
											</c:when>
											<c:otherwise>
												<span class="text-info text-center">금연실</span>
											</c:otherwise>
											</c:choose>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-warning btn-user">UPDATE</button>&nbsp;&nbsp;
												<button class="btn btn-danger btn-user">DELETE</button>
											</div>
										</div>										
										
									</div><!-- card-body -->
								</div><!-- row -->
							</div>

						</div><!-- </div class="col-lg-12"> -->
					</div><!-- row -->

				</div><!-- </div class="container-fluid"> -->

			</div><!-- </div id="content"> -->

			</div><!-- </div id="content-wrapper" class="d-flex flex-column"> -->

	</div><!-- <div id="wrapper"> -->
	<!-- End of Page Wrapper -->
<%-- /////////////////////////////////////////////// /Main Page (sidebar + topbar + main) /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Footer /////////////////////////////////////////////// --%>
	<!-- Footer -->
	<footer class="sticky-footer bg-white">
		<div class="container my-auto">
			<div class="copyright text-center my-auto">
				<span>Copyright &copy; BESTPLAYKJ 2019</span>
			</div>
		</div>
	</footer>
	<!-- End of Footer -->
<%-- /////////////////////////////////////////////// /Footer /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Top Button /////////////////////////////////////////////// --%>
	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top">
		<i class="fas fa-angle-up"></i>
	</a>
<%-- /////////////////////////////////////////////// /Top Button /////////////////////////////////////////////// --%>


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

</body>

</html>
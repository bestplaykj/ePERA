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
	
	<!-- Custom styles for this page -->
	<link href="${contextPath}/resources/template/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
</head>

<body id="page-top">

<%-- /////////////////////////////////////////////// Main Page (sidebar + topbar + main) /////////////////////////////////////////////// --%>
	<!-- Page Wrapper -->
	<div id="wrapper">
	
		<!-- sidebar -->
		<jsp:include page="../../../include/sidebar.jsp" />

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
     
     				<!-- topbar -->
				<jsp:include page="../../../include/topbar.jsp" />

				<!-- Begin Page Content -->
				<div class="container-fluid">
				
					<!-- Page Heading -->
					<div class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">${sessionScope.emp.name}'s Schedule</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<div class="row">
										<div class="col-md-2">
										<c:url var="getSchedule" value="getEmpSchedule.do">
											<c:param name="empId" value="${sessionScope.emp.id}"></c:param>
										</c:url>
											<a href="${getSchedule}"><span class="text-danger">&lt;- Schedule</span></a>
										</div>
										<div class="col-md-8"></div>
										<div class="col-md-2"></div>
									</div>
								</div>
								<div class="row text-center">
							<c:choose>
							<c:when test="${fn:length(list) ne 0}">
							<c:forEach var="i" begin="0" end="${fn:length(list)-1}" step="1">
									<div class="col-xl-4 col-md-6 mb-4">
										<div class="card border-left-primary shadow h-100 py-2">
											<div class="card-body">
												<div class="row no-gutters align-items-center">
													<div class="col-auto">
														<i class="fas fa-calendar fa-2x text-gray-300"></i>
													</div>
													<div class="col mr-2">
														<div class="text-md font-weight-bold text-primary text-uppercase mb-1">${list[i].name}</div>
														<div class="text-s font-weight-bold text-success text-uppercase mb-1">${list[i].sDate}</div>
													<c:if test="${list[i].rotation eq 1}">
														<div class="h5 mb-0 font-weight-bold text-gray-800">00:00 ~ 08:30</div>
													</c:if>
													<c:if test="${list[i].rotation eq 2}">
														<div class="h5 mb-0 font-weight-bold text-gray-800">08:00 ~ 16:30</div>
													</c:if>
													<c:if test="${list[i].rotation eq 3}">
														<div class="h5 mb-0 font-weight-bold text-gray-800">16:00 ~ 00:30</div>
													</c:if>
													</div>
												</div>
											</div><!-- card-body -->
										</div>
									</div><!-- col-xl-4 col-md-6 mb-4 -->
							</c:forEach>
							</c:when>
							<c:otherwise>
									<div class="col-xl-4 col-md-6 mb-4"></div>
									<div class="col-xl-4 col-md-6 mb-4">
										<div class="card border-left-primary shadow h-100 py-2">
											<div class="card-body">
												<div class="row no-gutters align-items-center">
													<div class="col-auto">
														<i class="fas fa-calendar fa-2x text-gray-300"></i>
													</div>
													<div class="col mr-2">
														<div class="text-xs font-weight-bold text-primary text-uppercase mb-1">No Schedule</div>
														<div class="h5 mb-0 font-weight-bold text-gray-800"></div>
													</div>
												</div>
											</div><!-- card-body -->
										</div>
									</div><!-- col-xl-4 col-md-6 mb-4 -->
									<div class="col-xl-4 col-md-6 mb-4"></div>
							</c:otherwise>
							</c:choose>
								
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
	
	<!-- Page level custom scripts -->
	<script src="${contextPath}/resources/template/js/demo/datatables-demo.js"></script>
<%-- /////////////////////////////////////////////// /commonScript /////////////////////////////////////////////// --%>

</body>

</html>
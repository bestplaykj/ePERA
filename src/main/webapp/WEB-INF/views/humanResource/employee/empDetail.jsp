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
						<h1 class="h3 mb-0 text-gray-800">Employee Management</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<span class="text-success font-weight-bold text-center">${employee.name}</span>
								</div>
								<div class="row">
									<div class="card-body">
										<div class="row">
											<div class="col-md-3 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">account</span>
											</div>
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">position</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${employee.account}</span>
											</div>
											<div class="col-md-4 text-s font-weight-bold text-info text-uppercase mb-1">
										<c:choose>
										<c:when test="${employee.authority eq 1}">
												<span class="text-secondary text-center">GENERAL MANAGER</span>
										</c:when>
										<c:when test="${employee.authority eq 2}">
												<span class="text-secondary text-center">OPERATION MANAGER</span>
										</c:when>
										<c:when test="${employee.authority eq 3}">
												<span class="text-secondary text-center">FRONTDESK MANAGER</span>
										</c:when>
										<c:when test="${employee.authority eq 4}">
												<span class="text-secondary text-center">FRONTDESK EMPLOYEE</span>
										</c:when>
										</c:choose>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-3 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">contact</span>
											</div>
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">Enroll-Date</span>
											</div>
										<c:if test="${employee.status eq 'N'}">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">Resign-Date</span>
											</div>
										</c:if>
										</div>
										<div class="row">
											<div class="col-md-3 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${employee.contact}</span>
											</div>
											<div class="col-md-4 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
												<fmt:formatDate pattern="yyyy-MM-dd" value="${employee.enrollDate}"/>
												</span>
											</div>
										<c:if test="${employee.status eq 'N'}">
											<div class="col-md-4 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
												<fmt:formatDate pattern="yyyy-MM-dd" value="${employee.resignDate}"/>
												</span>
											</div>
										</c:if>
										</div>
										
										<br>
										
										<c:url value="updateEmpJSP.do" var="upEmp">
											<c:param name="id" value="${employee.id}" />
										</c:url>
										<c:url value="resignEmp.do" var="resEmp">
											<c:param name="id" value="${employee.id}" />
										</c:url>
										<c:url value="activateEmp.do" var="actEmp">
											<c:param name="id" value="${employee.id}" />
										</c:url>
										
										<c:if test="${employee.status eq 'Y'}">
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-warning btn-user" onclick="location.href='${upEmp}'">UPDATE</button>&nbsp;&nbsp;
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#resignModal">RESIGN</button>
											</div>
										</div>										
										</c:if>
										<c:if test="${employee.status eq 'N'}">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#activateModal">ACTIVATE</button>
											</div>
										</c:if>
										
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


<%-- /////////////////////////////////////////////// Resign Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="resignModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">RESIGN '${employee.name}'</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "RESIGN" below if you are ready to proceed resigning of '${employee.name}'</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="${resEmp}">RESIGN</a>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// Resign Modal /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Activate Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="activateModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">ACTIVATE '${employee.name}'</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "ACTIVATE" below if you are ready to proceed to activate '${employee.name}'</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="${actEmp}">ACTIVATE</a>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// Activate Modal /////////////////////////////////////////////// --%>


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
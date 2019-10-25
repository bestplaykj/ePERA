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
						<h1 class="h3 mb-0 text-gray-800">Reservation</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<span class="text-success font-weight-bold text-center">#${rsv.no}</span>
								</div>
								<div class="row">
									<div class="card-body">
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">guest</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">check in</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">check out</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${rsv.guest}</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
													<fmt:formatDate value="${rsv.iDate}" pattern="yyyy-MM-dd" />
												</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
													<fmt:formatDate value="${rsv.oDate}" pattern="yyyy-MM-dd" />
												</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">night</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">ppl</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">contractor</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${rsv.night}
													<c:if test="${rsv.night eq 1}"> night</c:if>
													<c:if test="${rsv.night ne 1}"> nights</c:if>
												</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${rsv.ppl} person</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${rsv.contractor}</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">roomtype</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">price</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">sales</span>
											</div>
										</div>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${rsv.roomType}</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
													<fmt:formatNumber value="${rsv.price}" pattern="#,###" />
												</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
													<fmt:formatNumber value="${rsv.sales}" pattern="#,###" />
												</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">status</span>
											</div>
										</div>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
										<c:choose>
											<c:when test="${rsv.status eq 'Y'}">
												<span class="text-secondary text-center">confirmed</span>
											</c:when>
											<c:when test="${rsv.status eq 'I'}">
												<span class="text-secondary text-center">check in</span>
											</c:when>
											<c:when test="${rsv.status eq 'O'}">
												<span class="text-secondary text-center">check out</span>
											</c:when>
											<c:when test="${rsv.status eq 'N'}">
												<span class="text-secondary text-center">canceled</span>
											</c:when>
										</c:choose>
											</div>
										</div>
										
										<br>
										
										<c:url value="updateRSV.do" var="upRSV">
											<c:param name="no" value="${rsv.no}" />
										</c:url>
										<c:url value="ciRSV.do" var="inRSV">
											<c:param name="no" value="${rsv.no}" />
										</c:url>
										<c:url value="coRSV.do" var="outRSV">
											<c:param name="no" value="${rsv.no}" />
										</c:url>
										<c:url value="cancelRSV.do" var="canRSV">
											<c:param name="no" value="${rsv.no}" />
										</c:url>
										
										<div class="row">
									<c:choose>
										<c:when test="${rsv.status eq 'Y'}">
											<div class="col-md-6 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-warning btn-user" data-toggle="modal" data-target="#updateModal">UPDATE</button>&nbsp;&nbsp;
												<button class="btn btn-primary btn-user" data-toggle="modal" data-target="#inModal">CHECK IN</button>&nbsp;&nbsp;
												<button class="btn btn-success btn-user" data-toggle="modal" data-target="#outModal">CHECK OUT</button>&nbsp;&nbsp;
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#cancelModal">CANCEL RSV</button>
											</div>
										</c:when>
										<c:when test="${rsv.status eq 'I'}">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#updateModal">UPDATE</button>&nbsp;&nbsp;
												<button class="btn btn-warning btn-user" data-toggle="modal" data-target="#outModal">CHECK OUT</button>
											</div>
										</c:when>
										<c:when test="${rsv.status eq 'O'}">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#updateModal">UPDATE</button>
											</div>
										</c:when>
										<c:when test="${rsv.status eq 'N'}">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#updateModal">UPDATE</button>
											</div>
										</c:when>
									</c:choose>
											
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


<%-- /////////////////////////////////////////////// Delete Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">DELETE #${rsv.no}</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "DELETE" below if you are ready to delete Room #${rsv.no}</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="${canRSV}">DELETE</a>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// Delete Modal /////////////////////////////////////////////// --%>


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
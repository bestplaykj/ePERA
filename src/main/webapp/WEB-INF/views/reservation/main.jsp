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
									<div class="row">
										<div class="col-md-2">
											<a href="#createRSVModal" data-toggle="modal" data-target="#createRSVModal">+ New Reservation</a>
										</div>
										<div class="col-md-9"></div>
										<div class="col-md-1"><a href="getAllRSV.do"><span class="text-danger">* SHOW ALL</span></a></div>
									</div>
								</div>
								<div class="row">
									<div class="card-body">
										<div class="table-responsive">
											<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
												<thead class="text-success">
													<tr>
														<th>#RSV</th>
														<th>GUEST</th>
														<th>ROOM TYPE</th>
														<th>PPL</th>
														<th>CHECK IN</th>
														<th>CHECK OUT</th>
													</tr>
												</thead>
												<tbody>
							<c:choose>
							<c:when test="${fn:length(list) ne 0}">
								<c:forEach var="i" begin="0" end="${fn:length(list)-1}" step="1">
													<tr>
														<td>${list[i].no}</td>
											<c:url value="getRSVDetail.do" var="detail">
												<c:param name="id" value="${list[i].no}" />
											</c:url>
														<td><a href="${detail}">${list[i].guest}</a></td>
														<td>${list[i].roomType}</td>
														<td>${list[i].ppl}</td>
														<td>${list[i].iDate}</td>
														<td>${list[i].oDate}</td>
													</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
													<tr>
														<td colspan="6" class="text-center">예약이 없습니다</td>
													</tr>
							</c:otherwise>
							</c:choose>
												</tbody>
											</table>
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


<%-- /////////////////////////////////////////////// CreateRSV Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="createRSVModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">NEW RESERVATION</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">
				<form action="createRSV.do" method="post" role="form">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<input type="text" class="form-control form-control-user" name="guest" required="required" placeholder="SURNAME, GivenName"><br>
							<input type="date" name="iDate" class="form-control form-control-user" required="required"><br>
							<input type="date" name="oDate" class="form-control form-control-user" required="required"><br>
							<input type="number" class="form-control form-control-user" name="night" required="required" placeholder="night" min="1"><br>
							<input type="number" class="form-control form-control-user" name="ppl" min="1" required="required" placeholder="party"><br>
							<select name="roomType" required="required" class="custom-select custom-select-sm">
					<c:if test="${fn:length(types) ne 0}">
						<c:forEach var="i" begin="0" end="${fn:length(types)-1}" step="1">
								<option value="${types[i]}">${types[i]}</option>
						</c:forEach>
					</c:if>
							</select><br><br>
							<input type="number" class="form-control form-control-user" name="price" required="required" placeholder="price" min="100000" step="1000"><br>
							<input type="number" class="form-control form-control-user" name="sales" required="required" placeholder="sales" min="100000" step="1000"><br>
							<select name="contractor" required="required" class="custom-select custom-select-sm">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
							</select><br><br>
						</div>
						<div class="col-md-2"></div>
					</div>
					<br><br>
					<div class="row">
						<div class="col-md-6 text-center"></div>
						<div class="col-md-6 text-center">
							<button class="btn btn-primary" type="submit">SUBMIT</button>
							<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
						</div>
					</div>
				</form>
				</div>
				<div class="modal-footer">
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /CreateRSV Modal /////////////////////////////////////////////// --%>


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
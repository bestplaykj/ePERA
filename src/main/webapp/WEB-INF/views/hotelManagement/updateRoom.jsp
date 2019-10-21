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
									<span class="text-danger font-weight-bold text-center">Update Room Details</span>
								</div>
								<div class="row">
									<div class="card-body">
							<form action="updateRoom.do" method="post">
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">floor</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<input type="number" class="form-control form-control-user" name="floor" required="required" min="1" max="20" value="${room.floor}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">room #</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<input type="number" class="form-control form-control-user" name="no" required="required" value="${room.no}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">room-type</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="type">
											<c:choose>
											<c:when test="${room.type eq 'DELUXE-DOUBLE'}">
													<option value="DELUXE-DOUBLE" selected="selected">DELUXE-DOUBLE</option>
													<option value="DELUXE-TWIN">DELUXE-TWIN</option>
													<option value="DELUXE-SUITE">DELUXE-SUITE</option>
													<option value="FAMILY-SUITE">FAMILY-SUITE</option>
											</c:when>
											<c:when test="${room.type eq 'DELUXE-TWIN'}">
													<option value="DELUXE-DOUBLE">DELUXE-DOUBLE</option>
													<option value="DELUXE-TWIN" selected="selected">DELUXE-TWIN</option>
													<option value="DELUXE-SUITE">DELUXE-SUITE</option>
													<option value="FAMILY-SUITE">FAMILY-SUITE</option>
											</c:when>
											<c:when test="${room.type eq 'DELUXE-SUITE'}">
													<option value="DELUXE-DOUBLE">DELUXE-DOUBLE</option>
													<option value="DELUXE-TWIN">DELUXE-TWIN</option>
													<option value="DELUXE-SUITE" selected="selected">DELUXE-SUITE</option>
													<option value="FAMILY-SUITE">FAMILY-SUITE</option>
											</c:when>
											<c:when test="${room.type eq 'FAMILY-SUITE'}">
													<option value="DELUXE-DOUBLE">DELUXE-DOUBLE</option>
													<option value="DELUXE-TWIN">DELUXE-TWIN</option>
													<option value="DELUXE-SUITE">DELUXE-SUITE</option>
													<option value="FAMILY-SUITE" selected="selected">FAMILY-SUITE</option>
											</c:when>
											</c:choose>
												</select>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">king-bed</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="king" id="king">
											<c:choose>
											<c:when test="${room.king eq 'N'}">
													<option value="N" selected="selected">N</option>
													<option value="Y">Y</option>
											</c:when>
											<c:when test="${room.king eq 'Y'}">
													<option value="N">N</option>
													<option value="Y" selected="selected">Y</option>
											</c:when>
											</c:choose>
												</select>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1" id="kBed">
												<input type="number" class="form-control form-control-user" required="required" name="kBed" min="0" max="10" value="${room.kBed}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">queen-bed</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="queen" id="queen">
											<c:choose>
											<c:when test="${room.queen eq 'N'}">
													<option value="N" selected="selected">N</option>
													<option value="Y">Y</option>
											</c:when>
											<c:when test="${room.queen eq 'Y'}">
													<option value="N">N</option>
													<option value="Y" selected="selected">Y</option>
											</c:when>
											</c:choose>
												</select>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1" id="qBed">
												<input type="number" class="form-control form-control-user" required="required" name="qBed" min="0" max="10" value="${room.qBed}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">capacity</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<input type="number" class="form-control form-control-user" name="capacity" required="required" min="1" max="10" value="${room.capacity}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">price</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<input type="number" class="form-control form-control-user" name="price" required="required" min="10000" step="1000" value="${room.price}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">smoking</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="smoking">
											<c:choose>
											<c:when test="${room.smoking eq 'N'}">
													<option value="N" selected="selected">N</option>
													<option value="Y">Y</option>
											</c:when>
											<c:when test="${room.smoking eq 'Y'}">
													<option value="N">N</option>
													<option value="Y" selected="selected">Y</option>
											</c:when>
											</c:choose>
												</select>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1 text-center">
												<button type="submit" class="btn btn-success">update</button>
											</div>
										</div>
							</form>										
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
<%-- /////////////////////////////////////////////// /commonScript /////////////////////////////////////////////// --%>


</body>

</html>
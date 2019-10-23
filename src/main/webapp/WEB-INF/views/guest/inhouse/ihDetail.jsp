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
	<link href="${contextPath}/resources/css/guest/ihDetail.css" rel="stylesheet">
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
						<h1 class="h3 mb-0 text-gray-800">Room Status</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<span class="text-success font-weight-bold text-center">${inhouse.guest}</span>
								</div>
								<div class="row">
									<div class="card-body">
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">floor</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">room</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">ppl</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${inhouse.floor}F</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">#${inhouse.roomNo}</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${inhouse.ppl}&nbsp;person</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">contractor</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">check-in</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">check-out</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">${inhouse.contractor}</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
													<fmt:formatDate value="${inhouse.iDate}" pattern="yyyy-MM-dd" />
												</span>
											</div>
											<div class="col-md-2 text-s font-weight-bold text-info text-uppercase mb-1">
												<span class="text-secondary text-center">
													<fmt:formatDate value="${inhouse.oDate}" pattern="yyyy-MM-dd" />&nbsp;12:00
												</span>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-2 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-secondary btn-user" id="passcodeBtn">SHOW PassCode</button>
											</div>
											<div class="col-md-2 text-s font-weight-bold mb-1 text-danger" id="showPCdiv">
												<span class="text-danger text-center">${inhouse.passcode}</span>
											</div>
										</div>
										
										<br>
										
										<c:url var="checkout" value="checkOutIH.do">
											<c:param name="passcode" value="${inhouse.passcode}" />
										</c:url>
								
								<c:if test="${inhouse.status eq 'I'}">
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-warning btn-user" data-toggle="modal" data-target="#updateModal">UPDATE</button>&nbsp;&nbsp;
												<button class="btn btn-danger btn-user" data-toggle="modal" data-target="#checkOutModal">CHECK-OUT</button>
											</div>
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


<%-- /////////////////////////////////////////////// Update Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">UPDATE</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">
				<form action="updateIHDetail.do" method="post" role="form">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<input type="hidden" name="passcode" value="${inhouse.passcode}">
							<input type="number" class="form-control form-control-user" name="floor" min="1" required="required" value="${inhouse.floor}"><br>
							<input type="number" class="form-control form-control-user" name="roomNo" min="1" required="required" value="${inhouse.roomNo}"><br>
							<input type="text" class="form-control form-control-user" name="guest" required="required" value="${inhouse.guest}"><br>
							<input type="number" class="form-control form-control-user" name="ppl" min="1" required="required" value="${inhouse.ppl}"><br>
							<select name="contractor" required="required" class="custom-select custom-select-sm">
						<c:choose>
						<c:when test="${inhouse.contractor eq 'Booking.com'}">
								<option value="Booking.com" selected="selected">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
						</c:when>
						<c:when test="${inhouse.contractor eq 'Agoda'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda" selected="selected">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
						</c:when>
						<c:when test="${inhouse.contractor eq 'Expedia'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia" selected="selected">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
						</c:when>
						<c:when test="${inhouse.contractor eq 'Hotels.com'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com" selected="selected">Hotels.com</option>
								<option value="FIT">FIT</option>
						</c:when>
						<c:otherwise>
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT" selected="selected">FIT</option>
						</c:otherwise>
						</c:choose>
							</select><br><br>
						</div>
						<div class="col-md-2"></div>
					</div>
					<br><br>
					<div class="row">
						<div class="col-md-6 text-center"></div>
						<div class="col-md-6 text-center">
							<button class="btn btn-primary" type="submit">UPDATE</button>
							<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
						</div>
					</div>
				</form>
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /Update Modal /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// CheckOut Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="checkOutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">CHECK-OUT</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "CHECK-OUT" below if you are ready to proceed to Check-Out</div>
				<div class="modal-footer">
					<a class="btn btn-primary" href="${checkout}">CHECK-OUT</a>
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /CheckOut Modal /////////////////////////////////////////////// --%>


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


<%-- /////////////////////////////////////////////// Script /////////////////////////////////////////////// --%>
	<script src="${contextPath}/resources/js/guest/ihDetail.js"></script>
<%-- /////////////////////////////////////////////// /Script /////////////////////////////////////////////// --%>

</body>

</html>
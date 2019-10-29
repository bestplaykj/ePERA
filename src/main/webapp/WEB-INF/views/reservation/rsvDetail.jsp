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
										
										<div class="row">
									<c:choose>
										<c:when test="${rsv.status eq 'Y'}">
											<div class="col-md-6 text-s font-weight-bold text-uppercase mb-1">
												<button class="btn btn-warning btn-user" data-toggle="modal" data-target="#updateModal">UPDATE</button>&nbsp;&nbsp;
												<button class="btn btn-primary btn-user" data-toggle="modal" data-target="#inModal" id="ciBtn">CHECK IN</button>&nbsp;&nbsp;
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
												<button class="btn btn-secondary btn-user" data-toggle="modal" data-target="#deleteModal">DELETE</button>
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
	
	<c:url value="coRSV.do" var="outRSV">
		<c:param name="no" value="${rsv.no}" />
	</c:url>
	<c:url value="cancelRSV.do" var="canRSV">
		<c:param name="no" value="${rsv.no}" />
	</c:url>
	<c:url value="deleteRSV.do" var="delRSV">
		<c:param name="no" value="${rsv.no}" />
	</c:url>

<%-- /////////////////////////////////////////////// Update Modal /////////////////////////////////////////////// --%>
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">UPDATE #${rsv.no}</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
			<form action="updateRSV.do" method="post" role="form">
				<div class="modal-body">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<input type="hidden" name="no" value="${rsv.no}">
							<input type="text" class="form-control form-control-user" name="guest" required="required" value="${rsv.guest}"><br>
							<input type="date" name="iDate" class="form-control form-control-user" required="required" id="RSViDate" value="${rsv.iDate}"><br>
							<input type="date" name="oDate" class="form-control form-control-user" required="required" id="RSVoDate" value="${rsv.oDate}"><br>
							<input type="number" class="form-control form-control-user" name="night" required="required" min="1" id="RSVnight" readonly="readonly" value="${rsv.night}"><br>
							<input type="number" class="form-control form-control-user" name="ppl" min="1" required="required" value="${rsv.ppl}"><br>
							<select name="roomType" required="required" class="custom-select custom-select-sm" id="roomSel">
					<c:if test="${fn:length(types) ne 0}">
						<c:forEach var="i" begin="0" end="${fn:length(types)-1}" step="1">
						<c:choose>
							<c:when test="${types[i] eq rsv.roomType}">
								<option value="${types[i]}" selected="selected">${types[i]}</option>							
							</c:when>
							<c:otherwise>
								<option value="${types[i]}">${types[i]}</option>
							</c:otherwise>
						</c:choose>
						</c:forEach>
					</c:if>
							</select><br><br>
							<input type="number" class="form-control form-control-user" name="price" required="required" value="${rsv.price}" min="100000" step="1000" id="RSVprice" readonly="readonly"><br>
							<input type="number" class="form-control form-control-user" name="sales" required="required" value="${rsv.sales}" min="100000" step="1000" id="RSVsales" readonly="readonly"><br>
							<select name="contractor" required="required" class="custom-select custom-select-sm">
						<c:choose>
							<c:when test="${rsv.contractor eq 'Booking.com'}">
								<option value="Booking.com" selected="selected">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
							</c:when>
							<c:when test="${rsv.contractor eq 'Agoda'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda" selected="selected">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
							</c:when>
							<c:when test="${rsv.contractor eq 'Expedia'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia" selected="selected">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
							</c:when>
							<c:when test="${rsv.contractor eq 'Hotels.com'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com" selected="selected">Hotels.com</option>
								<option value="FIT">FIT</option>
							</c:when>
							<c:when test="${rsv.contractor eq 'FIT'}">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT" selected="selected">FIT</option>
							</c:when>
						</c:choose>
							</select><br><br>
						</div>
						<div class="col-md-2"></div>
					</div>
					<br>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="submit">UPDATE</button>
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
				</div>
			</form>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /Update Modal /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Check-In Modal /////////////////////////////////////////////// --%>
	<div class="modal fade" id="inModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Check In #'${rsv.no}'</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
			<form action="ciRSV.do" method="post">
				<div class="modal-body">
					<input type="hidden" name="no" value="${rsv.no}">
					<input type="hidden" name="floor" id="floorSel">
					<select name="roomNo" id="roomNoSel" required="required" class="custom-select custom-select-sm"></select>
				</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="submit">CHECK IN</button>
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
				</div>
			</form>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /Check-In Modal /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Check-Out Modal /////////////////////////////////////////////// --%>
	<div class="modal fade" id="outModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Check Out #'${rsv.no}'</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "CHECK OUT" below if you are ready to proceed to check-out '${rsv.guest}'</div>
				<div class="modal-footer">
					<a class="btn btn-primary" href="${outRSV}">CHECK OUT</a>
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /Check-Out Modal /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Cancel Modal /////////////////////////////////////////////// --%>
	<div class="modal fade" id="cancelModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Cancel #'${rsv.no}'</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "CANCEL" below if you are ready to proceed to cancel '${rsv.guest}'</div>
				<div class="modal-footer">
					<a class="btn btn-primary" href="${canRSV}">CANCEL</a>
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /Cancel Modal /////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Delete Modal /////////////////////////////////////////////// --%>
	<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Delete #'${rsv.no}'</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "DELETE" below if you are ready to proceed to delete '${rsv.guest}'</div>
				<div class="modal-footer">
					<a class="btn btn-primary" href="${delRSV}">DELETE</a>
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// /Delete Modal /////////////////////////////////////////////// --%>


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
	<script src="${contextPath}/resources/js/reservation/rsvDetail.js"></script>
	<script src="${contextPath}/resources/js/reservation/rsvDetailAjax.js"></script>
<%-- /////////////////////////////////////////////// /Script /////////////////////////////////////////////// --%>

</body>

</html>
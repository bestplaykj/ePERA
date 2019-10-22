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
						<h1 class="h3 mb-0 text-gray-800">Room Status</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<a href="#checkinModal" data-toggle="modal" data-target="#checkinModal">+ New Guest</a>
								</div>
								<div class="row">
									<div class="card-body">
							<c:choose>
								<c:when test="${fn:length(floor) ne 0}">
									<c:forEach var="i" begin="0" end="${floor[2]-1}" step="1">
										<hr>
										<div class="row">
											<div class="col-md-12"><span class="text-danger font-weight-bold">${floor[0]+i}F</span></div>
										</div>
										<div class="row">
											<div class="col-md-1"></div>
											<div class="col-md-10">
										<c:if test="${fn:length(list[i]) ne 0}">
												<div class="row">
										<c:forEach var="j" begin="0" end="${fn:length(list[i])-1}" step="1">
													<div class="col-xl-3 col-md-3 mb-3 border-left-primary shadow h-100 py-2 text-center">
														<div class="text-s font-weight-bold text-info text-uppercase mb-1">
															<span class="text-success">${(list[i])[j].no}</span>&nbsp;&nbsp;
															<span class="text-warning">(${(list[i])[j].type})(${(list[i])[j].capacity})</span><br>
												<c:if test="${fn:length(inhouse) ne 0}">
													<c:forEach var="k" begin="0" end="${fn:length(inhouse)-1}" step="1">
													<c:if test="${(list[i])[j].no eq inhouse[k].roomNo}">
												<c:url value="getInHouseDetail.do" var="detail">
													<c:param name="passcode" value="${inhouse[k].passcode}" />
												</c:url>
															<a href="${detail}">
															<span class="text-secondary">${inhouse[k].guest}(${inhouse[k].ppl})</span>
															</a><br>
															<span class="text-danger">
																<fmt:formatDate value="${inhouse[k].iDate}" pattern="yyyy-MM-dd" />
															</span>
															<span class="text-secondary">&nbsp;~&nbsp;</span>
															<span class="text-danger">
																<fmt:formatDate value="${inhouse[k].oDate}" pattern="yyyy-MM-dd" />
															</span>
													</c:if>
													</c:forEach>
												</c:if>
														</div>
													</div>
										</c:forEach>
												</div>
										</c:if>
											</div>
											<div class="col-md-1"></div>
										</div>
										<br>
									</c:forEach>
								</c:when>
								<c:otherwise>
										<div class="col-md-3 text-center">현재 등록된 객실이 없음</div>
								</c:otherwise>
							</c:choose>
									</div><!-- card-body -->
								</div><!-- row -->
								
							<c:if test="${sessionScope.passcode ne null}">
								<input type="hidden" value="${sessionScope.passcode}" id="Hpasscode">
							</c:if>
							
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


<%-- /////////////////////////////////////////////// CheckIn Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="checkinModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">CHECK IN</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">
				<form action="checkInGuest.do" method="post" role="form">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<input type="number" class="form-control form-control-user" name="floor" min="1" required="required" placeholder="floor"><br>
							<input type="number" class="form-control form-control-user" name="roomNo" min="1" required="required" placeholder="room#"><br>
							<input type="text" class="form-control form-control-user" name="guest" required="required" placeholder="SURNAME, GivenName"><br>
							<input type="number" class="form-control form-control-user" name="ppl" min="1" required="required" placeholder="party"><br>
							<select name="contractor" required="required" class="custom-select custom-select-sm">
								<option value="Booking.com">Booking.com</option>
								<option value="Agoda">Agoda</option>
								<option value="Expedia">Expedia</option>
								<option value="Hotels.com">Hotels.com</option>
								<option value="FIT">FIT</option>
							</select><br><br>
							<input type="date" name="iDate" class="form-control form-control-user" required="required"><br>
							<input type="date" name="oDate" class="form-control form-control-user" required="required">
						</div>
						<div class="col-md-2"></div>
					</div>
					<br><br>
					<div class="row">
						<div class="col-md-6 text-center"></div>
						<div class="col-md-6 text-center">
							<button class="btn btn-primary" type="submit">CHECK-IN</button>
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
<%-- /////////////////////////////////////////////// CheckIn Modal /////////////////////////////////////////////// --%>


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
	<script src="${contextPath}/resources/js/guest/main.js"></script>
<%-- /////////////////////////////////////////////// /Script /////////////////////////////////////////////// --%>

<% session.removeAttribute("passcode"); %>

</body>

</html>
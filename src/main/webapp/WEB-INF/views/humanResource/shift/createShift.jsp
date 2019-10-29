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
						<h1 class="h3 mb-0 text-gray-800">Schedule Management</h1>
					</div>

					<!-- Content Row -->
					<div class="row"><!-- row -->
						<div class="col-lg-12"><!-- <div class="col-lg-12"> -->

							<!-- Illustrations -->
							<div class="card shadow mb-12">
								<div class="card-header py-12">
									<span class="text-danger font-weight-bold text-center">Create New Schedule</span>
								</div>
								<div class="row">
									<div class="card-body">
							<form action="createShift.do" method="post">
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">name</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<select name="name" required="required" id="shiftName">
											<c:choose>
											<c:when test="${fn:length(list) ne 0}">
											<c:forEach var="i" begin="0" end="${fn:length(list)-1}" step="1">
												<c:if test="${list[i].authority eq 4}">
													<option value="${list[i].name}">${list[i].name}</option>
												</c:if>
											</c:forEach>
											</c:when>
											</c:choose>
												</select>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">id</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="text" class="form-control form-control-user" name="id" id="shiftID" required="required" readonly="readonly">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">year</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="number" class="form-control form-control-user" name="year" required="required" min="2000" placeholder="2019">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">quarter</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="quarter">
													<option value="1">1st QUARTER</option>
													<option value="2">2nd QUARTER</option>
													<option value="3">3rd QUARTER</option>
													<option value="4">4th QUARTER</option>
												</select>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">date</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="date" class="form-control form-control-user" name="sDate" required="required">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">rotation</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="rotation" required="required">
													<option value="1">08:00 ~ 16:30</option>
													<option value="2">16:00 ~ 00:30</option>
													<option value="3">00:00 ~ 08:30</option>
												</select>
											</div>
										</div>
										
										<br>
																				
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1 text-center">
												<button type="submit" class="btn btn-success">CREATE</button>
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


<%-- /////////////////////////////////////////////// Script /////////////////////////////////////////////// --%>
	<script src="${contextPath}/resources/js/hotelManagement/shift/createShift.js"></script>
<%-- /////////////////////////////////////////////// /Script /////////////////////////////////////////////// --%>


</body>

</html>
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
	
	<link href="${contextPath}/resources/css/hotelManagement/updateEmp.css" rel="stylesheet">
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
									<span class="text-danger font-weight-bold text-center">Update</span>
									<span class="text-success font-weight-bold text-center">${employee.name}</span>
									<span class="text-danger font-weight-bold text-center">'s Detail</span>
								</div>
								<div class="row">
									<div class="card-body">
							<form action="updateEmp.do" method="post">
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">name</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="text" class="form-control form-control-user" name="name" required="required" value="${employee.name}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">account</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="text" class="form-control form-control-user" name="account" required="required" value="${employee.account}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">password</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="text" class="form-control form-control-user" name="password" required="required" value="${employee.password}">
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">postion</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3 text-s font-weight-bold text-uppercase mb-1">
								<c:choose>
								<c:when test="${employee.authority eq 1}"><span class="text-secondary text-center">GENERAL MANAGER</span></c:when>
								<c:when test="${employee.authority eq 2}"><span class="text-secondary text-center">OPERATION MANAGER</span></c:when>
								<c:when test="${employee.authority eq 3}"><span class="text-secondary text-center">FRONTDESK MANAGER</span></c:when>
								<c:when test="${employee.authority eq 4}"><span class="text-secondary text-center">FRONTDESK EMPLOYEE</span></c:when>
								</c:choose>
											</div>
											<div class="col-md-1 text-s font-weight-bold text-uppercase mb-1">
												<button type="button" class="btn btn-secondary" id="promoBtn">PROMO</button>
											</div>
											<div class="col-md-1 text-s font-weight-bold text-uppercase mb-1" id="cancelDiv">
												<button type="button" class="btn btn-secondary" id="cancelBtn">CANCEL</button>
											</div>
										</div>
										
										<div class="row" id="promotionEmp">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<select class="custom-select custom-select-sm" name="authority">
								<c:choose>
								<c:when test="${employee.authority eq 1}">
													<option value="4">FRONTDESK EMPLOYEE</option>
													<option value="3">FRONTDESK MANAGER</option>
													<option value="2">OPERATION MANAGER</option>
													<option value="1" selected="selected">GENERAL MANAGER</option>
								</c:when>
								<c:when test="${employee.authority eq 2}">
													<option value="4">FRONTDESK EMPLOYEE</option>
													<option value="3">FRONTDESK MANAGER</option>
													<option value="2" selected="selected">OPERATION MANAGER</option>
													<option value="1">GENERAL MANAGER</option>
								</c:when>
								<c:when test="${employee.authority eq 3}">
													<option value="4">FRONTDESK EMPLOYEE</option>
													<option value="3" selected="selected">FRONTDESK MANAGER</option>
													<option value="2">OPERATION MANAGER</option>
													<option value="1">GENERAL MANAGER</option>
								</c:when>
								<c:when test="${employee.authority eq 4}">
													<option value="4" selected="selected">FRONTDESK EMPLOYEE</option>
													<option value="3">FRONTDESK MANAGER</option>
													<option value="2">OPERATION MANAGER</option>
													<option value="1">GENERAL MANAGER</option>
								</c:when>
								</c:choose>
												</select>
											</div>
										</div>
										
										<br>
										
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<span class="text-primary text-center">contact</span>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1">
												<input type="text" class="form-control form-control-user" name="contact" required="required" value="${employee.contact}">
											</div>
										</div>
										
										<br>
										
										<input type="hidden" name="id" value="${employee.id}">
																				
										<div class="row">
											<div class="col-md-4 text-s font-weight-bold text-uppercase mb-1 text-center">
												<button type="submit" class="btn btn-warning">UPDATE</button>
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
	<script src="${contextPath}/resources/js/hotelManagement/updateEmp.js"></script>
<%-- /////////////////////////////////////////////// /Script /////////////////////////////////////////////// --%>

</body>

</html>
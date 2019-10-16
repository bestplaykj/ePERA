<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%--  ////////////////////////////////////////////// top bar ////////////////////////////////////////////// --%>      

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Alerts -->
            <li class="nav-item dropdown no-arrow mx-1">
              <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-bell fa-fw"></i>
                <!-- Counter - Alerts -->
                <span class="badge badge-danger badge-counter">알람 갯수</span>
              </a>
              <!-- Dropdown - Alerts -->
              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="alertsDropdown">
                <h6 class="dropdown-header">
                  in-house request
                </h6>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-secondary">
                      <i class="fas fa-trash-alt text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">객실번호</div>
                    <span class="font-weight-bold">housekeeping</span>
                    <div class="small text-gray-500">요청 일시</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-danger">
                      <i class="fas fa-exclamation-triangle text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">객실번호</div>
                    <span class="font-weight-bold">DND</span>
                    <div class="small text-gray-500">요청 일시</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-success">
                      <i class="fas fa-user-alt text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">객실 번호</div>
                    <span class="font-weight-bold">etc - 세부 요청 사항</span>
                    <div class="small text-gray-500">요청 일시</div>
                  </div>
                </a>
                <a class="dropdown-item text-center small text-gray-500" href="#">Show All Requests</a>
              </div>
            </li>

            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">
                	${sessionScope.emp.name} (
                <c:if test="${sessionScope.emp.authority eq 1}">General Manager</c:if>
                <c:if test="${sessionScope.emp.authority eq 2}">Frontdesk Manager</c:if>
                <c:if test="${sessionScope.emp.authority eq 3}">Operation Manager</c:if>
                <c:if test="${sessionScope.emp.authority eq 0}">Employee</c:if>
                	)
                </span>
              </a>
              <!-- Dropdown - Logout -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">Sign Out</a>
              </div>
            </li>

          </ul>

        </nav>
        <!-- End of Topbar -->
        
        
<%--  ////////////////////////////////////////////// /top bar ////////////////////////////////////////////// --%>


<%-- /////////////////////////////////////////////// Sign Out Modal /////////////////////////////////////////////// --%>
	<!-- Signout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Sign Out" below if you are ready to end.<br>Please check your T&A before sign out.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="signOutEmp.do">Sign Out</a>
				</div>
			</div>
		</div>
	</div>
<%-- /////////////////////////////////////////////// Sign Out Modal /////////////////////////////////////////////// --%>
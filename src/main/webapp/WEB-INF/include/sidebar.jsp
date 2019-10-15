<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%--  ////////////////////////////////////////////// side bar ////////////////////////////////////////////// --%>

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i> <!-- 나중에 없애버려 -->
        </div>
        <div class="sidebar-brand-text mx-3">ePera</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Reservation -->
      <li class="nav-item active">
        <a class="nav-link" href="#">
          <i class="fas fa-fw fa-calendar-check"></i>
          <span>Reservation</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">FRONTDESK</div>

      <!-- Nav Item - Room Status -->
      <li class="nav-item active">
        <a class="nav-link" href="#">
          <i class="fas fa-fw fa-bed"></i>
          <span>Room Status</span>
        </a>
      </li>

      <!-- Nav Item - Time and Attendance -->
      <li class="nav-item active">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-edit"></i>
          <span>Time and Attendance</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <!-- <h6 class="collapse-header">Custom Utilities:</h6> -->
            <a class="collapse-item" href="utilities-color.html">Attendance</a>
            <a class="collapse-item" href="utilities-border.html">Schedule</a>
          </div>
        </div>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        MANAGER
      </div>

      <!-- Nav Item - Finacial Statement -->
      <li class="nav-item active">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-chart-bar"></i>
          <span>Financial Statement</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">classification</h6>
            <a class="collapse-item" href="#">income</a>
            <a class="collapse-item" href="#">expenses</a>
            <a class="collapse-item" href="#">profit</a>
            <h6 class="collapse-header">statement</h6>
            <a class="collapse-item" href="#">report</a>
          </div>
        </div>
      </li>

      <!-- Nav Item - Hotel Management -->
      <li class="nav-item active">
        <a class="nav-link" href="#">
          <i class="fas fa-fw fa-hotel"></i>
          <span>Hotel Management</span></a>
      </li>

      <!-- Nav Item - Human Resources -->
      <li class="nav-item active">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseHR" aria-expanded="true" aria-controls="collapseHR">
          <i class="fas fa-fw fa-user-edit"></i>
          <span>Human Resources</span></a>
          <div id="collapseHR" class="collapse" aria-labelledby="headingHR" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="#">employee</a>
            <a class="collapse-item" href="#">T&A</a>
            <a class="collapse-item" href="#">schedule</a>
          </div>
        </div>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->
    
    
<%--  ////////////////////////////////////////////// /side bar ////////////////////////////////////////////// --%>
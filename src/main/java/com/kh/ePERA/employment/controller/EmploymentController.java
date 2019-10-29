package com.kh.ePERA.employment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.kh.ePERA.employment.employee.service.EmployeeService;
import com.kh.ePERA.employment.employee.vo.Employee;
import com.kh.ePERA.employment.shift.service.ShiftService;
import com.kh.ePERA.employment.shift.vo.Shift;
import com.kh.ePERA.employment.tna.service.AttendanceService;
import com.kh.ePERA.employment.wage.service.WageService;

@SessionAttributes("emp")
@Controller
public class EmploymentController {
		
	@Autowired
	private EmployeeService emps;
	
	@Autowired
	private ShiftService shifts;
	
	@Autowired
	private AttendanceService atts;
	
	@Autowired
	private WageService wages;
	
	//---------------------- Employee ----------------------
	
	@RequestMapping("signInEmp.do")
	public String signInEmp(Employee e, Model model) {
		
		Employee user = emps.signInEmp(e);
		if(user != null) {
			model.addAttribute("emp", user);
			return "main/main";
		}else {
			return "redirect:home.do";
		}
				
	}//signInEmp
	
	
	@RequestMapping("signOutEmp.do")
	public String signOutEmp(SessionStatus status) {
		
		status.setComplete();
		return "redirect:home.do";
		
	}//signOutEmp
	
	
	@RequestMapping("getAllEmp.do")
	public ModelAndView getAllEmp(ModelAndView mv) {
		
		ArrayList<Employee> ar = emps.getAllEmp();
		mv.addObject("list", ar).setViewName("humanResource/employee/main");
		
		return mv;
		
	}//getAllEmp
	
	
	@RequestMapping("createEmpJSP.do")
	public String createEmpJSP() {
		
		return "humanResource/employee/createEmp";
		
	}//createEmpJSP
	
	
	@RequestMapping("createEmp.do")
	public String createEmp(Employee emp) {
		
		int result = emps.createEmp(emp);
		if(result > 0) {
			return "redirect:getAllEmp.do";			
		}else {
			return "common/error";
		}
		
	}//createEmp
	
	
	@RequestMapping("getEmpDetail.do")
	public ModelAndView getEmpDetail(int id, ModelAndView mv) {
		
		Employee emp = emps.getEmp(id);
		mv.addObject("employee", emp).setViewName("humanResource/employee/empDetail");
		
		return mv;
		
	}//getEmpDetail
	
	
	@RequestMapping("resignEmp.do")
	public String resignEmp(int id) {
		
		int result = emps.deleteEmp(id);
		if(result > 0) {
			return "redirect:getAllEmp.do";			
		}else {
			return "common/error";
		}
		
	}//resignEmp
	
	
	@RequestMapping("updateEmpJSP.do")
	public ModelAndView updateEmpJSP(int id, ModelAndView mv) {
		
		Employee emp = emps.getEmp(id);
		mv.addObject("employee", emp).setViewName("humanResource/employee/updateEmp");
		
		return mv;
		
	}//updateEmpJSP
	
	
	@RequestMapping("updateEmp.do")
	public ModelAndView updateEmp(Employee emp, ModelAndView mv) {
		
		int result = emps.updateEmp(emp);
		if(result > 0) {
			Employee empUp = emps.getEmp(emp.getId());
			mv.addObject("employee", empUp).setViewName("humanResource/employee/empDetail");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//updateEmp
	
	
	@RequestMapping("getAllEmpIncR.do")
	public ModelAndView getAllEmpIncR(ModelAndView mv) {
		
		ArrayList<Employee> ar = emps.getAllEmpIncR();
		mv.addObject("list", ar).setViewName("humanResource/employee/main");
		
		return mv;
		
	}//getAllEmpIncR
	
	
	@RequestMapping("activateEmp.do")
	public ModelAndView activateEmp(int id, ModelAndView mv) {
		
		int result = emps.activateEmp(id);
		if(result > 0) {
			Employee emp = emps.getEmp(id);
			mv.addObject("employee", emp).setViewName("humanResource/employee/empDetail");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//activateEmp
	
	
	//---------------------- /Employee ----------------------
	
	//---------------------- Shift ----------------------
	
	@RequestMapping("getAllSchedules.do")
	public ModelAndView getAllSchedules(ModelAndView mv) {
		
		ArrayList<Shift> ar = shifts.getAllShifts();
		
		mv.addObject("list", ar).setViewName("humanResource/shift/main");
		
		return mv;
		
	}//getAllSchedule
	
	
	@RequestMapping("createShiftJSP.do")
	public ModelAndView createShiftJSP(ModelAndView mv) {
		
		ArrayList<Employee> ar = emps.getAllEmp();
		
		mv.addObject("list", ar).setViewName("humanResource/shift/createShift");
		
		return mv;
		
	}//createShiftJSP
	
	
	@ResponseBody
	@RequestMapping("getEmpIdAjax.do")
	public void getEmpIdAjax(String name, HttpServletResponse response) throws JsonIOException, IOException {
		
		int id = emps.getEmpId(name);
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(id, response.getWriter());
		
	}//getEmpIdAjax
	
	
	@RequestMapping("createShift.do")
	public String createShift(Shift s) {
		
		int result = shifts.createShift(s);
		if(result > 0) {
			return "redirect:getAllSchedules.do";			
		}else {
			return "common/error";
		}
		
	}//createShift
	
	
	@RequestMapping("getAllScheduleIncAll.do")
	public ModelAndView getAllScheduleIncAll(ModelAndView mv) {
		
		ArrayList<Shift> ar = shifts.getAllShiftsIncAll();
		
		mv.addObject("list", ar).setViewName("humanResource/shift/showAll");
		
		return mv;
		
	}//getAllScheduleIncAll
	
	
	@RequestMapping("getShiftDetail.do")
	public ModelAndView getShiftDetail(int no, ModelAndView mv) {
		
		Shift s = shifts.getShift(no);
		
		mv.addObject("shift", s).setViewName("humanResource/shift/shiftDetail");
		
		return mv;
		
	}//getShiftDetail
	
	
	
	
	
	
	//---------------------- /Shift ----------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//class

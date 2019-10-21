package com.kh.ePERA.employment.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ePERA.employment.employee.service.EmployeeService;
import com.kh.ePERA.employment.employee.vo.Employee;
import com.kh.ePERA.employment.shift.service.ShiftService;
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
	
	//--------------------------------------------
	
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
			return "common/404";
		}
		
	}//createEmp
	
	
	@RequestMapping("getEmpDetail.do")
	public ModelAndView getEmpDetail(int id, ModelAndView mv) {
		
		Employee emp = emps.getEmp(id);
		mv.addObject("employee", emp).setViewName("humanResource/employee/empDetail");
		
		return mv;
		
	}//getEmpDetail.do
	
	

}//class

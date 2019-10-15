package com.kh.ePERA.employment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kh.ePERA.employment.employee.service.EmployeeService;
import com.kh.ePERA.employment.employee.vo.Employee;
import com.kh.ePERA.employment.shift.service.ShiftService;
import com.kh.ePERA.employment.tna.service.AttendanceService;
import com.kh.ePERA.employment.wage.service.WageService;

@SessionAttributes("emp")
@Controller
public class EmploymentController {
		
	@Autowired
	private EmployeeService es;
	
	@Autowired
	private ShiftService ss;
	
	@Autowired
	private AttendanceService as;
	
	@Autowired
	private WageService ws;
	
	//--------------------------------------------
	
	@RequestMapping("signInEmp.do")
	public String signInEmp(Employee e, Model model) {
		
		System.out.println("start");
		
		System.out.println(e.getAccount());
		System.out.println(e.getPassword());
		
		Employee user = es.signInEmp(e);
		if(user != null) {
			model.addAttribute("emp", user);
			return "main/main.jsp";
		}else {
			model.addAttribute("emp", user);
			return "redirect:home.do";
		}
				
	}//signInEmp
	

}//class

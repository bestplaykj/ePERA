package com.kh.ePERA.employment.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
import com.kh.ePERA.employment.tna.vo.Attendance;
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
	
	
	@ResponseBody
	@RequestMapping("getEmpNameAjx.do")
	public void getEmpNameAjx(HttpServletResponse response) throws JsonIOException, IOException {
		
		ArrayList<Employee> ar = emps.getAllEmp();
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(ar, response.getWriter());
		
	}//getEmpNameAjx
	
	
	@RequestMapping("updateShift.do")
	public ModelAndView updateShift(Shift s, ModelAndView mv) {
		
		int result = shifts.updateShift(s);
		if(result > 0) {
			Shift updateS = shifts.getShift(s.getNo());
			mv.addObject("shift", updateS).setViewName("humanResource/shift/shiftDetail");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//updateShift
	
	
	@RequestMapping("deleteShift.do")
	public String deleteShift(int no) {
		
		int result = shifts.deleteShift(no);
		if(result > 0) {
			return "redirect:getAllSchedules.do";
		}else {
			return "common/error";
		}
		
	}//deleteShift
	
	
	@RequestMapping("getEmpSchedule.do")
	public ModelAndView getEmpSchedule(int empId, ModelAndView mv) {
		
		ArrayList<Shift> ar = shifts.getAllShiftsById(empId);
		mv.addObject("list", ar).setViewName("humanResource/shift/empMain");
		
		return mv;
		
	}//getEmpSchedule
	
	
	@RequestMapping("getAllScheduleIncAllById.do")
	public ModelAndView getAllScheduleIncAllById(int empId, ModelAndView mv) {
		
		ArrayList<Shift> ar = shifts.getAllShiftsIncAllById(empId);
		mv.addObject("list", ar).setViewName("humanResource/shift/empShowAll");		
		
		return mv;
		
	}//getAllScheduleIncAllById
	
	
	//---------------------- /Shift ----------------------
	
	//---------------------- Attendance ----------------------
	
	@RequestMapping("getAllAttById.do")
	public ModelAndView getAllAtt(int empId, ModelAndView mv) {
		
		ArrayList<Attendance> ar = atts.getAllAttById(empId);
		int result = atts.checkTodayAttStatus(empId);
		if(result > 0) {
			Attendance today = atts.getAttById(empId);
			mv.addObject("check", "Y").addObject("today", today);
		}else {
			mv.addObject("check", "N");
		}
		
		mv.addObject("list", ar).setViewName("humanResource/att/empMain");
		
		return mv;		
		
	}//getEmpAtt
	
	
	@RequestMapping("attend.do")
	public ModelAndView attend(int empId, ModelAndView mv) {
		
		Employee e = emps.getEmp(empId);
		
		Date today = new Date();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
		int quarter = 0;
		int month = 0;
		switch (sdfMonth.format(today)) {
		case "01": quarter= 1; month= 1; break;
		case "02": quarter= 1; month= 2; break;
		case "03": quarter= 1; month= 3; break;
		case "04": quarter= 2; month= 4; break;
		case "05": quarter= 2; month= 5; break;
		case "06": quarter= 2; month= 6; break;
		case "07": quarter= 3; month= 7; break;
		case "08": quarter= 3; month= 8; break;
		case "09": quarter= 3; month= 9; break;
		case "10": quarter= 4; month= 10; break;
		case "11": quarter= 4; month= 11; break;
		case "12": quarter= 4; month= 12; break;
		default:
			break;
		}
	
		Attendance att = new Attendance();
		att.setId(e.getId());
		att.setName(e.getName());
		att.setYear(Integer.parseInt(year.format(today)));
		att.setQuarter(quarter);
		att.setMonth(month);
		
		int result = atts.attend(att);
		if(result > 0) {
			ArrayList<Attendance> ar = atts.getAllAttById(e.getId());
			int result2 = atts.checkTodayAttStatus(e.getId());
			if(result2 > 0) {
				Attendance check = atts.getAttById(e.getId());
				mv.addObject("check", "Y").addObject("today", check);
			}else {
				mv.addObject("check", "N");
			}
			
			mv.addObject("list", ar).setViewName("humanResource/att/empMain");
			
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//attend
	
	
	@RequestMapping("leaveOff.do")
	public ModelAndView leaveOff(int empId, ModelAndView mv) {
		
		Attendance att = atts.getAttById(empId);
		
		int result = atts.leave(att.getNo());
		if(result > 0) {
			Attendance att2 = atts.getAttById(att.getId());
			double diff = (double)(att2.getoTime().getTime() - att2.getiTime().getTime());
			att2.setwTime(((diff/1000)/60)/60);
			
			int result2 = atts.getWTime(att2);
			
			Attendance check = atts.getAttById(att2.getId());
			
			ArrayList<Attendance> ar = atts.getAllAttById(att2.getId());
			
			mv.addObject("check", "Y").addObject("today", check).addObject("list", ar).setViewName("humanResource/att/empMain");
			
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//leaveOff
	
	
	@RequestMapping("getAllEmpAtt.do")
	public ModelAndView getAllEmpAtt(ModelAndView mv) {
		
		ArrayList<Attendance> ar1 = atts.getAllAtt();
		ArrayList<Shift> ar2 = shifts.getAllAttShifts();
		
		mv.addObject("Alist", ar1).addObject("Slist", ar2).setViewName("humanResource/att/main");
		
		return mv;
		
	}//getAllEmpAtt
	
	
	
	
	
	
	
	//---------------------- Attendance ----------------------
	
	

}//class

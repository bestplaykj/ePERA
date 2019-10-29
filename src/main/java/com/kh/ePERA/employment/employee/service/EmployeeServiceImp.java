package com.kh.ePERA.employment.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.employment.employee.dao.EmployeeDAO;
import com.kh.ePERA.employment.employee.vo.Employee;

@Service("emps")
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeDAO empd;
		
	
	@Override
	public int createEmp(Employee emp) {
		
		return empd.createEmp(emp);
		
	}//createEmp

	
	@Override
	public int updateEmp(Employee emp) {
		
		return empd.updateEmp(emp);
		
	}//updateEmp

	
	@Override
	public int deleteEmp(int id) {
		
		return empd.deleteEmp(id);
		
	}//deleteEmp

	
	@Override
	public Employee signInEmp(Employee emp) {
		
		return empd.signInEmp(emp);
		
	}//signInEmp

	
	@Override
	public ArrayList<Employee> getAllEmp() {
		
		return empd.getAllEmp();
		
	}//getAllEmp

	
	@Override
	public ArrayList<Employee> getAllEmpIncR() {
		
		return empd.getAllEmpIncR();
		
	}//getAllEmpIncR

	
	@Override
	public Employee getEmp(int id) {
		
		return empd.getEmp(id);
		
	}//getEmp


	@Override
	public int activateEmp(int id) {
		
		return empd.activateEmp(id);
		
	}//activateEmp


	@Override
	public int getEmpId(String name) {
		
		return empd.getEmpId(name);
		
	}//getEmpId
	

	
	
}//class
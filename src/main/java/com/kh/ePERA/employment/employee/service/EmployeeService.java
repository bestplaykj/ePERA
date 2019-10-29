package com.kh.ePERA.employment.employee.service;

import java.util.ArrayList;

import com.kh.ePERA.employment.employee.vo.Employee;

public interface EmployeeService {
	
	int createEmp(Employee emp);
	
	int updateEmp(Employee emp);
	
	int deleteEmp(int id);
	
	Employee signInEmp(Employee emp);
	
	ArrayList<Employee> getAllEmp();
	
	ArrayList<Employee> getAllEmpIncR();
	
	Employee getEmp(int id);
	
	int activateEmp(int id); 
	
	int getEmpId(String name);

}//interface
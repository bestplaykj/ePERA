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
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int deleteEmp(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
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
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Employee getEmp(int id) {
		
		return empd.getEmp(id);
		
	}//getEmp

	
	@Override
	public int grantAuthority(int id, int auth) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}//class
package com.kh.ePERA.employment.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.employment.employee.dao.EmployeeDAO;
import com.kh.ePERA.employment.employee.vo.Employee;

@Service("es")
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeDAO ed;
		
	
	@Override
	public int createEmp(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	
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
		
		return ed.signInEmp(emp);
		
	}//signInEmp

	
	@Override
	public ArrayList<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Employee> getAllEmpIncR() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Employee getEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int grantAuthority(int id, int auth) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}//class
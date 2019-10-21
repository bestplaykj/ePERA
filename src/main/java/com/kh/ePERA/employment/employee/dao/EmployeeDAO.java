package com.kh.ePERA.employment.employee.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.employment.employee.vo.Employee;

@Repository("empd")
public class EmployeeDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public Employee signInEmp(Employee emp) {
		
		return sqlSession.selectOne("employeeMapper.signInEmp", emp);
		
	}//signInEmp
	
	
	public ArrayList<Employee> getAllEmp() {
		
		return (ArrayList)sqlSession.selectList("employeeMapper.getAllEmp");
		
	}//getAllEmp
	
	
	public int createEmp(Employee emp) {
		
		return sqlSession.insert("employeeMapper.createEmp", emp);
		
	}//createEmp
	
	
	public Employee getEmp(int id) {
		
		return sqlSession.selectOne("employeeMapper.getEmp", id);
		
	}//getEmp
	

}//class
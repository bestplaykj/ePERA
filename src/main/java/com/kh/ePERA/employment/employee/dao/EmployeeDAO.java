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
	
	
	public int deleteEmp(int id) {
		
		return sqlSession.update("employeeMapper.deleteEmp", id);
		
	}//deleteEmp
	
	
	public int updateEmp(Employee emp) {
		
		return sqlSession.update("employeeMapper.updateEmp", emp);
		
	}//updateEmp
	
	
	public ArrayList<Employee> getAllEmpIncR() {
		
		return (ArrayList)sqlSession.selectList("employeeMapper.getAllEmpIncR");
		
	}//getAllEmpIncR
	
	
	public int activateEmp(int id) {
		
		return sqlSession.update("employeeMapper.activateEmp", id);
		
	}//activateEmp
	
	
	public int getEmpId(String name) {
		
		return sqlSession.selectOne("employeeMapper.getEmpId", name);
		
	}//getEmpId
	

}//class
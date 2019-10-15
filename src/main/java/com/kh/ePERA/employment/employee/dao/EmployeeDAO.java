package com.kh.ePERA.employment.employee.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.employment.employee.vo.Employee;

@Repository("ed")
public class EmployeeDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public Employee signInEmp(Employee emp) {
		
		return sqlSession.selectOne("employeeMapper.signInEmp", emp);
		
	}//signInEmp
	
	

}//class
package com.kh.ePERA.employment.shift.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sd")
public class ShiftDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
}//class
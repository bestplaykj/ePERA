package com.kh.ePERA.employment.wage.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("waged")
public class WageDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	

}//cass
package com.kh.ePERA.employment.tna.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ad")
public class AttendanceDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	

}//class
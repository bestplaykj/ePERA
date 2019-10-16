package com.kh.ePERA.guest.inHouseRequest.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ihrd")
public class InHouseRequestDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	

}//class
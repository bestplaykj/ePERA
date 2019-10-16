package com.kh.ePERA.guest.inHouse.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ihd")
public class InHouseDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	

}//class
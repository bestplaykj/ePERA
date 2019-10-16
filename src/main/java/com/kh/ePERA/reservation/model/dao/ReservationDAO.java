package com.kh.ePERA.reservation.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("rsvd")
public class ReservationDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	
	
	

}//class
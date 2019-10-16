package com.kh.ePERA.room.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("roomd")
public class RoomDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	
	

}//class
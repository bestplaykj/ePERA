package com.kh.ePERA.guest.inHouse.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.guest.inHouse.vo.InHouse;

@Repository("ihd")
public class InHouseDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<InHouse> getAllInHouses() {
		
		return (ArrayList)sqlSession.selectList("inhouseMapper.getAllInHouses");
		
	}//getAllInHouses
	
		
	public ArrayList<InHouse> getAllInHousesByFloor(int floor) {
		
		return (ArrayList)sqlSession.selectList("inhouseMapper.getAllInHousesByFloor", floor);
		
	}//getAllInHousesByFloor
	
	
	public int checkIn(InHouse ih) {
		
		return sqlSession.insert("inhouseMapper.checkIn", ih);
		
	}//checkIn
	
	
	public int checkPassCode(String passcode) {
		
		return sqlSession.selectOne("inhouseMapper.checkPassCode", passcode);
		
	}//checkPassCode
	
	
	public InHouse getInHouseDetail(String passcode) {
		
		return sqlSession.selectOne("inhouseMapper.getInHouseDetail", passcode);
		
	}//getInHouseDetail
	
	
	
	
}//class
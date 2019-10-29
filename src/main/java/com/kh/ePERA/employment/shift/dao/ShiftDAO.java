package com.kh.ePERA.employment.shift.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.employment.shift.vo.Shift;

@Repository("shiftd")
public class ShiftDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Shift> getAllShifts() {
		
		return (ArrayList)sqlSession.selectList("shiftMapper.getAllShifts");
		
	}//getAllShifts
	
	
	public int createShift(Shift s) {
		
		return sqlSession.insert("shiftMapper.createShift", s);
		
	}//createShift
	
	
	public ArrayList<Shift> getAllShiftsIncAll() {
		
		return (ArrayList)sqlSession.selectList("shiftMapper.getAllShiftsIncAll");
		
	}//getAllShiftsIncAll
	
	
	public Shift getShift(int no) {
		
		return sqlSession.selectOne("shiftMapper.getShift", no);
		
	}//getShift
	
	
	
	
	
	
}//class
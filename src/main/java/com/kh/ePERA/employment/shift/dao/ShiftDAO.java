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
	
	
	public int updateShift(Shift s) {
		
		return sqlSession.update("shiftMapper.updateShift", s);
		
	}//updateShift
	
	
	public int deleteShift(int no) {
		
		return sqlSession.delete("shiftMapper.deleteShift", no);
		
	}//deleteShift
	
	
	public ArrayList<Shift> getAllShiftsById(int id) {
		
		return (ArrayList)sqlSession.selectList("shiftMapper.getAllShiftsById", id);
		
	}//getAllShiftsById
	
	
	public ArrayList<Shift> getAllShiftsIncAllById(int id) {
		
		return (ArrayList)sqlSession.selectList("shiftMapper.getAllShiftsIncAllById", id);
		
	}//getAllShiftsIncAllById
	
	
	public ArrayList<Shift> getAllAttShifts() {
		
		return (ArrayList)sqlSession.selectList("shiftMapper.getAllAttShifts");
		
	}//getAllAttShifts
	
	
	
	
}//class
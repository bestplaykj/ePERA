package com.kh.ePERA.employment.tna.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.employment.tna.vo.Attendance;

@Repository("attd")
public class AttendanceDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Attendance> getAllAttById(int id) {
		
		return (ArrayList)sqlSession.selectList("attendanceMapper.getAllAttById", id);		
		
	}//getAllAtt
	
	
	public int checkTodayAttStatus(int id) {
		
		return sqlSession.selectOne("attendanceMapper.checkTodayAttStatus", id);
		
	}//checkTodayAttStatus
	
	
	public Attendance getAttById(int id) {
		
		return sqlSession.selectOne("attendanceMapper.getAttById", id);
		
	}//getAttById
	
	
	public int attend(Attendance att) {
		
		return sqlSession.insert("attendanceMapper.attend", att);
		
	}//attend
	
	
	public int leave(int no) {
		
		return sqlSession.update("attendanceMapper.leave", no);
		
	}//leave
	
	
	public int getWTime(Attendance att) {
		
		return sqlSession.update("attendanceMapper.getWTime", att);
		
	}//getWTime
	
	
	public ArrayList<Attendance> getAllAtt() {
		
		return (ArrayList)sqlSession.selectList("attendanceMapper.getAllAtt");
		
	}//getAllAtt
	
	

}//class
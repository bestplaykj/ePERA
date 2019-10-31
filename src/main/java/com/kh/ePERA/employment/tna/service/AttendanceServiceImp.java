package com.kh.ePERA.employment.tna.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.employment.tna.dao.AttendanceDAO;
import com.kh.ePERA.employment.tna.vo.Attendance;

@Service("atts")
public class AttendanceServiceImp implements AttendanceService{

	@Autowired
	private AttendanceDAO attd;
	
	
	@Override
	public int attend(Attendance att) {
		
		return attd.attend(att);
		
	}//attend

	
	@Override
	public int leave(int no) {
		
		return attd.leave(no);
		
	}//leave
	
	
	@Override
	public int getWTime(Attendance att) {
		
		return attd.getWTime(att);
		
	}//getWTime


	@Override
	public int handlingAtt(Attendance att) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public ArrayList<Attendance> getAllAtt() {
		
		return attd.getAllAtt();
		
	}//getAllAtt

	
	@Override
	public ArrayList<Attendance> getAllAttById(int id) {
		
		return attd.getAllAttById(id);
		
	}//getAllAtt
	
	
	@Override
	public int checkTodayAttStatus(int id) {
		
		return attd.checkTodayAttStatus(id);
	
	}//checkTodayAttStatus


	@Override
	public ArrayList<Attendance> getAllAttByDate(Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Attendance> getAllAttByDate(int id, Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Attendance getAttById(int id) {
		
		return attd.getAttById(id);
		
	}//getAttById
	
	
}//class
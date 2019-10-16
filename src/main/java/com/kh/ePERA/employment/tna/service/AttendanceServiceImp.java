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
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int leave(Attendance att) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int handlingAtt(Attendance att) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public ArrayList<Attendance> getAllAtt() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Attendance> getAllAtt(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
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
	public Attendance getAtt(int no) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}//class
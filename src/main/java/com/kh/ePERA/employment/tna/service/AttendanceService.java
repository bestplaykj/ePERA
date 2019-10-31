package com.kh.ePERA.employment.tna.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.employment.tna.vo.Attendance;

public interface AttendanceService {
	
	int attend(Attendance att);
	
	int leave(int no);
	
	int getWTime(Attendance att);
	
	int handlingAtt(Attendance att);
	
	ArrayList<Attendance> getAllAtt();

	ArrayList<Attendance> getAllAttById(int id);
	
	int checkTodayAttStatus(int id);
	
	ArrayList<Attendance> getAllAttByDate(Date date, int duration);

	ArrayList<Attendance> getAllAttByDate(int id, Date date, int duration);
		
	Attendance getAttById(int id);
	
}//interface
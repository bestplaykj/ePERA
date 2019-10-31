package com.kh.ePERA.employment.shift.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.employment.shift.vo.Shift;

public interface ShiftService {
	
	int createShift(Shift s);
	
	int updateShift(Shift s);
	
	int deleteShift(int no);
	
	Shift getShift(int no);
	
	ArrayList<Shift> getAllShifts();
	
	ArrayList<Shift> getAllAttShifts();
	
	ArrayList<Shift> getAllShiftsIncAll();
	
	ArrayList<Shift> getAllShiftsById(int id);
	
	ArrayList<Shift> getAllShiftsIncAllById(int id);
	
	ArrayList<Shift> getShiftsByDate(Date date, int duration);	

}//interface
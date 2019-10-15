package com.kh.ePERA.employment.shift.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.employment.shift.vo.Shift;

public interface ShiftService {
	
	int createShift(Shift s);
	
	int updateShift(Shift s);
	
	int deleteShift(Shift s);
	
	Shift getShift();
	
	ArrayList<Shift> getAllShifts();
	
	ArrayList<Shift> getShiftsByDate(Date date, int duration);	

}//interface
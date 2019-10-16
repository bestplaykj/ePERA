package com.kh.ePERA.employment.shift.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.employment.shift.dao.ShiftDAO;
import com.kh.ePERA.employment.shift.vo.Shift;

@Service("shifts")
public class ShiftServiceImp implements ShiftService{

	@Autowired
	private ShiftDAO shiftd;
	
	
	@Override
	public int createShift(Shift s) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int updateShift(Shift s) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int deleteShift(Shift s) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Shift getShift() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Shift> getAllShifts() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Shift> getShiftsByDate(Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}
	

}//class
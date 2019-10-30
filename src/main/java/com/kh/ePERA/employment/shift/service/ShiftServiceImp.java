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
		
		return shiftd.createShift(s);
		
	}//createShift

	
	@Override
	public int updateShift(Shift s) {
		
		return shiftd.updateShift(s);
		
	}//updateShift

	
	@Override
	public int deleteShift(int no) {
		
		return shiftd.deleteShift(no);
		
	}//deleteShift

	
	@Override
	public Shift getShift(int no) {
		
		return shiftd.getShift(no);
		
	}//getShift

	
	@Override
	public ArrayList<Shift> getAllShifts() {
		
		return shiftd.getAllShifts();
		
	}//getAllShifts
	
	
	@Override
	public ArrayList<Shift> getAllShiftsIncAll() {
		
		return shiftd.getAllShiftsIncAll();
		
	}//getAllShiftsIncAll
	
	
	@Override
	public ArrayList<Shift> getAllShiftsById(int id) {
		
		return shiftd.getAllShiftsById(id);
		
	}//getAllShiftsById
	
	
	@Override
	public ArrayList<Shift> getAllShiftsIncAllById(int id) {
		
		return shiftd.getAllShiftsIncAllById(id);
		
	}//getAllShiftsIncAllById


	@Override
	public ArrayList<Shift> getShiftsByDate(Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}
	

}//class
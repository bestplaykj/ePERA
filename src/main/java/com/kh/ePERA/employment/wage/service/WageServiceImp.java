package com.kh.ePERA.employment.wage.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.employment.wage.dao.WageDAO;
import com.kh.ePERA.employment.wage.vo.Wage;

@Service("wages")
public class WageServiceImp implements WageService{

	@Autowired
	private WageDAO waged;
	
	
	@Override
	public ArrayList<Wage> getAllWages() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Wage> getAllWages(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Wage> getAllWagesByDate(Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Wage> getAllWagesByDate(int id, Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Wage> getAllWagesByEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Wage getWage(int no) {
		// TODO Auto-generated method stub
		return null;
	}
	

}//class
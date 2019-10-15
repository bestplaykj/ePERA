package com.kh.ePERA.employment.wage.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.employment.wage.vo.Wage;

public interface WageService {
	
	ArrayList<Wage> getAllWages();
	
	ArrayList<Wage> getAllWages(int id);
	
	ArrayList<Wage> getAllWagesByDate(Date date, int duration);
	
	ArrayList<Wage> getAllWagesByDate(int id, Date date, int duration);
	
	ArrayList<Wage> getAllWagesByEmp(int id);
	
	Wage getWage(int no);

}//interface
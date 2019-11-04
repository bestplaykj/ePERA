package com.kh.ePERA.accounting.finance.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.accounting.expenses.vo.Expenses;
import com.kh.ePERA.accounting.finance.dao.FinanceDAO;
import com.kh.ePERA.accounting.revenue.vo.Revenue;

@Service("fins")
public class FinanceServiceImp implements FinanceService{
	
	@Autowired
	private FinanceDAO find;

	
	@Override
	public ArrayList<Revenue> getAllRevenueByyMonth() {
		
		return find.getAllRevenueByyMonth();
		
	}//getAllRevenueByyMonth
	
	
	@Override
	public ArrayList<Revenue> getAllRevenueByyMonthB1() {
		
		return find.getAllRevenueByyMonthB1();
		
	}//getAllRevenueByyMonthB1


	@Override
	public ArrayList<Revenue> getAllRevenueByyMonthB2() {
		
		return find.getAllRevenueByyMonthB2();
		
	}//getAllRevenueByyMonthB2
	

	@Override
	public ArrayList<Expenses> getAllExpensesByyMonth() {
		
		return find.getAllExpensesByyMonth();
		
	}//getAllExpensesByyMonth


	@Override
	public ArrayList<Expenses> getAllExpensesByyMonthB1() {
		
		return find.getAllExpensesByyMonthB1();
	
	}//getAllExpensesByyMonthB1


	@Override
	public ArrayList<Expenses> getAllExpensesByyMonthB2() {
		
		return find.getAllExpensesByyMonthB2();
		
	}//getAllExpensesByyMonthB2
	

}//class

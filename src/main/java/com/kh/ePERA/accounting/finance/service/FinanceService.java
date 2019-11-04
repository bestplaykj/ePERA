package com.kh.ePERA.accounting.finance.service;

import java.util.ArrayList;

import com.kh.ePERA.accounting.expenses.vo.Expenses;
import com.kh.ePERA.accounting.revenue.vo.Revenue;

public interface FinanceService {
	
	ArrayList<Revenue> getAllRevenueByyMonth();
	
	ArrayList<Revenue> getAllRevenueByyMonthB1();
	
	ArrayList<Revenue> getAllRevenueByyMonthB2();
	
	ArrayList<Expenses> getAllExpensesByyMonth();
	
	ArrayList<Expenses> getAllExpensesByyMonthB1();
	
	ArrayList<Expenses> getAllExpensesByyMonthB2();

}//interface

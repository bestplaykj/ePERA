package com.kh.ePERA.accounting.expenses.service;

import java.util.ArrayList;

import com.kh.ePERA.accounting.expenses.vo.Expenses;

public interface ExpensesService {
	
	
	int createExpenses(Expenses ex);
	
	int deleteExpenses(int no);
	
	ArrayList<Expenses> getAllExpenses();
	
	ArrayList<String> getyMonth();
	
	ArrayList<Expenses> getAllExpensesByyMonth(String yMonth);
	

}//interface

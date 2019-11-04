package com.kh.ePERA.accounting.expenses.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.accounting.expenses.dao.ExpensesDAO;
import com.kh.ePERA.accounting.expenses.vo.Expenses;

@Service("exps")
public class ExpensesServiceImp implements ExpensesService{
	
	@Autowired
	private ExpensesDAO expd;

		
	@Override
	public int createExpenses(Expenses ex) {
		
		return expd.createExpenses(ex);
		
	}//createExpenses


	@Override
	public int deleteExpenses(int no) {
		
		return expd.deleteExpenses(no);
		
	}//deleteExpenses


	@Override
	public ArrayList<Expenses> getAllExpenses() {
		
		return expd.getAllExpenses();
		
	}//getAllExpenses


	@Override
	public ArrayList<String> getyMonth() {
		
		return expd.getyMonth();
		
	}//getyMonth


	@Override
	public ArrayList<Expenses> getAllExpensesByyMonth(String yMonth) {
		
		return expd.getAllExpensesByyMonth(yMonth);
		
	}//getAllExpensesByyMonth
	

}//class

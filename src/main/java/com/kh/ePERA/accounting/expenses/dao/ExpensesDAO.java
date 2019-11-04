package com.kh.ePERA.accounting.expenses.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.accounting.expenses.vo.Expenses;

@Repository("expd")
public class ExpensesDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Expenses> getAllExpenses() {
		
		return (ArrayList)sqlSession.selectList("expensesMapper.getAllExpenses");
		
	}//getAllExpenses
	
	
	public int createExpenses(Expenses ex) {
		
		return sqlSession.insert("expensesMapper.createExpenses", ex);
		
	}//createExpenses
	
	
	public int deleteExpenses(int no) {
		
		return sqlSession.delete("expensesMapper.deleteExpenses", no);
		
	}//deleteExpenses
	
	
	public ArrayList<String> getyMonth() {
		
		return (ArrayList)sqlSession.selectList("expensesMapper.getyMonth");
		
	}//getyMonth
	
	
	public ArrayList<Expenses> getAllExpensesByyMonth(String yMonth) {
		
		return (ArrayList)sqlSession.selectList("expensesMapper.getAllExpensesByMonth", yMonth);
		
	}//getAllExpensesByyMonth
	
	

}//class

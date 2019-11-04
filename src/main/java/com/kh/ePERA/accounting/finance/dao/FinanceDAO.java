package com.kh.ePERA.accounting.finance.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.accounting.expenses.vo.Expenses;
import com.kh.ePERA.accounting.revenue.vo.Revenue;

@Repository("find")
public class FinanceDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Revenue> getAllRevenueByyMonth() {
		
		return (ArrayList)sqlSession.selectList("revenueMapper.getAllRevenueByyMonth");
		
	}//getAllRevenueByyMonth
	
	
	public ArrayList<Revenue> getAllRevenueByyMonthB1() {
		
		return (ArrayList)sqlSession.selectList("revenueMapper.getAllRevenueByyMonthB1");
		
	}//getAllRevenueByyMonthB1
	
	
	public ArrayList<Revenue> getAllRevenueByyMonthB2() {
		
		return (ArrayList)sqlSession.selectList("revenueMapper.getAllRevenueByyMonthB2");
		
	}//getAllRevenueByyMonthB2
	
	
	public ArrayList<Expenses> getAllExpensesByyMonth() {
		
		return (ArrayList)sqlSession.selectList("expensesMapper.getAllExpensesByyMonth");
		
	}//getAllExpensesByyMonth
	
	
	public ArrayList<Expenses> getAllExpensesByyMonthB1() {
		
		return (ArrayList)sqlSession.selectList("expensesMapper.getAllExpensesByyMonthB1");
		
	}//getAllExpensesByyMonthB1


	public ArrayList<Expenses> getAllExpensesByyMonthB2() {
	
		return (ArrayList)sqlSession.selectList("expensesMapper.getAllExpensesByyMonthB2");
	
	}//getAllExpensesByyMonthB2
	

}//class

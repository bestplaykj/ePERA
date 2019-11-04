package com.kh.ePERA.accounting.revenue.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.accounting.revenue.vo.Revenue;

@Repository("revd")
public class RevenueDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Revenue> getAllRevenue() {
		
		return (ArrayList)sqlSession.selectList("revenueMapper.getAllRevenue");
		
	}//getAllRevenue
	
	
	public int insertRevenue(Revenue r) {
		
		return sqlSession.insert("revenueMapper.insertRevenue", r);
		
	}//insertRevenue
	
	
	public int deleteRevenue(int no) {
		
		return sqlSession.delete("revenueMapper.deleteRevenue", no);
		
	}//deleteRevenue
	
	
	public ArrayList<String> getyMonth() {
		
		return (ArrayList)sqlSession.selectList("revenueMapper.getyMonth");
		
	}//getyMonth
	
	
	public ArrayList<Revenue> getAllRevenueByyMonth(String yMonth) {
		
		return (ArrayList)sqlSession.selectList("revenueMapper.getAllRevenueByMonth", yMonth);
		
	}//getAllRevenueByyMonth
	

}//class

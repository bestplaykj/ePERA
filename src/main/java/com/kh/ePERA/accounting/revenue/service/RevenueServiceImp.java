package com.kh.ePERA.accounting.revenue.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.accounting.revenue.dao.RevenueDAO;
import com.kh.ePERA.accounting.revenue.vo.Revenue;

@Service("revs")
public class RevenueServiceImp implements RevenueService {

	@Autowired
	private RevenueDAO revd;
	

	@Override
	public int insertRevenue(Revenue r) {
		
		return revd.insertRevenue(r);
		
	}//insertRevenue
	

	@Override
	public int deleteRevenue(int no) {
		
		return revd.deleteRevenue(no);
		
	}//deleteRevenue
	

	@Override
	public ArrayList<Revenue> getAllRevenue() {
		
		return revd.getAllRevenue();
	
	}//getAllRevenue


	@Override
	public ArrayList<String> getyMonth() {
		
		return revd.getyMonth();
		
	}//getyMonth


	@Override
	public ArrayList<Revenue> getAllRevenueByyMonth(String yMonth) {
		
		return revd.getAllRevenueByyMonth(yMonth);
		
	}//getAllRevenueByyMonth
	
	
}//class

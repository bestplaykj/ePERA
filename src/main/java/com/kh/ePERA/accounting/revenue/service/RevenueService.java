package com.kh.ePERA.accounting.revenue.service;

import java.util.ArrayList;

import com.kh.ePERA.accounting.revenue.vo.Revenue;

public interface RevenueService {
	
	int insertRevenue(Revenue r);
	
	int deleteRevenue(int no);
	
	ArrayList<Revenue> getAllRevenue();
	
	ArrayList<String> getyMonth();
	
	ArrayList<Revenue> getAllRevenueByyMonth(String yMonth);
	

}//interface

package com.kh.ePERA.accounting.finance.vo;

public class Finance {
	
	private String yMonth;
	private double revenue;
	private double expenses;
	private double netIncome;
	
	
	public Finance() {}
	public Finance(String yMonth, double revenue, double expenses, double netIncome) {
		this.yMonth = yMonth;
		this.revenue = revenue;
		this.expenses = expenses;
		this.netIncome = netIncome;
	}

	
	public String getyMonth() {
		return yMonth;
	}
	public void setyMonth(String yMonth) {
		this.yMonth = yMonth;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public double getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(double netIncome) {
		this.netIncome = netIncome;
	}
	

}//class

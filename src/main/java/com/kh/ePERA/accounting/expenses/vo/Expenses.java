package com.kh.ePERA.accounting.expenses.vo;

import java.sql.Date;

public class Expenses {
	
	private int no;
	private int year;
	private int quarter;
	private int month;
	private Date iDate;
	private String type;
	private String vendor;
	private double amount;
	private String paymentMethod;
	
	
	public Expenses() {}
	public Expenses(int no, int year, int quarter, int month, Date iDate, String type, String vendor, double amount, String paymentMethod) {
		this.no = no;
		this.year = year;
		this.quarter = quarter;
		this.month = month;
		this.iDate = iDate;
		this.type = type;
		this.vendor = vendor;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getQuarter() {
		return quarter;
	}
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Date getiDate() {
		return iDate;
	}
	public void setiDate(Date iDate) {
		this.iDate = iDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	

}//class

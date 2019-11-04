package com.kh.ePERA.accounting.revenue.vo;

import java.sql.Date;

public class Revenue {
	
	private int no;
	private int year;
	private int quarter;
	private int month;
	private Date iDate;
	private double income;
	private String note;
	
	
	public Revenue() {}
	public Revenue(int no, int year, int quarter, int month, Date iDate, double income, String note) {
		this.no = no;
		this.year = year;
		this.quarter = quarter;
		this.month = month;
		this.iDate = iDate;
		this.income = income;
		this.note = note;
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
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
		

}//class

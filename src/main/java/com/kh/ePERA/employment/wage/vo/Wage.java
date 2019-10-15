package com.kh.ePERA.employment.wage.vo;

public class Wage {
	
	private int no;
	private int id;
	private String name;
	private int year;
	private int quarter;
	private int month;
	private int attendance;
	private int wTime;
	private String extraShift;
	private int overtime;
	private String wageMethod;
	private int hourly;
	private int monthly;
	private int extra;
	private int wage;
	
	
	public Wage() {}
	public Wage(int no, int id, String name, int year, int quarter, int month, int attendance, int wTime, String extraShift, int overtime, String wageMethod, int hourly, int monthly, int extra, int wage) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.year = year;
		this.quarter = quarter;
		this.month = month;
		this.attendance = attendance;
		this.wTime = wTime;
		this.extraShift = extraShift;
		this.overtime = overtime;
		this.wageMethod = wageMethod;
		this.hourly = hourly;
		this.monthly = monthly;
		this.extra = extra;
		this.wage = wage;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getwTime() {
		return wTime;
	}
	public void setwTime(int wTime) {
		this.wTime = wTime;
	}
	public String getExtraShift() {
		return extraShift;
	}
	public void setExtraShift(String extraShift) {
		this.extraShift = extraShift;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public String getWageMethod() {
		return wageMethod;
	}
	public void setWageMethod(String wageMethod) {
		this.wageMethod = wageMethod;
	}
	public int getHourly() {
		return hourly;
	}
	public void setHourly(int hourly) {
		this.hourly = hourly;
	}
	public int getMonthly() {
		return monthly;
	}
	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	

}//class
package com.kh.ePERA.employment.tna.vo;

import java.sql.Date;

public class Attendance {
	
	private int no;
	private int id;
	private String name;
	private int year;
	private int quarter;
	private int month;
	private Date aDate;
	private Date iTime;
	private Date oTime;
	private int wTime;
	
	
	public Attendance() {}
	public Attendance(int no, int id, String name, int year, int quarter, int month, Date aDate, Date iTime, Date oTime, int wTime) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.year = year;
		this.quarter = quarter;
		this.month = month;
		this.aDate = aDate;
		this.iTime = iTime;
		this.oTime = oTime;
		this.wTime = wTime;
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
	public Date getaDate() {
		return aDate;
	}
	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}
	public Date getiTime() {
		return iTime;
	}
	public void setiTime(Date iTime) {
		this.iTime = iTime;
	}
	public Date getoTime() {
		return oTime;
	}
	public void setoTime(Date oTime) {
		this.oTime = oTime;
	}
	public int getwTime() {
		return wTime;
	}
	public void setwTime(int wTime) {
		this.wTime = wTime;
	}
	

}//class
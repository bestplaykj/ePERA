package com.kh.ePERA.employment.shift.vo;

import java.sql.Date;

public class Shift {
	
	private int no;
	private int id;
	private String name;
	private int year;
	private int quarter;
	private int month;
	private Date sDate;
	private int rotation;
	
	
	public Shift() {}
	public Shift(int no, int id, String name, int year, int quarter, int month, Date sDate, int rotation) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.year = year;
		this.quarter = quarter;
		this.month = month;
		this.sDate = sDate;
		this.rotation = rotation;
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
	public Date getsDate() {
		return sDate;
	}
	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}
	public int getRotation() {
		return rotation;
	}
	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	

}//class
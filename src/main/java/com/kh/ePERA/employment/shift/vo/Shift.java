package com.kh.ePERA.employment.shift.vo;

import java.sql.Date;

public class Shift {
	
	private int no;
	private int id;
	private String name;
	private int year;
	private int quarter;
	private Date sDate;
	private int rotation;
	private int month;
	
	
	public Shift() {}
	public Shift(int no, int id, String name, int year, int quarter, Date sDate, int rotation, int month) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.year = year;
		this.quarter = quarter;
		this.sDate = sDate;
		this.rotation = rotation;
		this.month = month;
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
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	

}//class
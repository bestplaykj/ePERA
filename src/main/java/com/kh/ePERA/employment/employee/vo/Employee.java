package com.kh.ePERA.employment.employee.vo;

import java.sql.Date;

public class Employee {
	
	private int id;
	private String account;
	private String password;
	private String name;
	private int authority;
	private String contact;
	private Date enrollDate;
	private Date resignDate;
	private String status;
	
	public Employee() {}
	public Employee(int id, String account, String password, String name, int authority, String contact, Date enrollDate, Date resignDate, String status) {
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.authority = authority;
		this.contact = contact;
		this.enrollDate = enrollDate;
		this.resignDate = resignDate;
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public Date getResignDate() {
		return resignDate;
	}
	public void setResignDate(Date resignDate) {
		this.resignDate = resignDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}//class
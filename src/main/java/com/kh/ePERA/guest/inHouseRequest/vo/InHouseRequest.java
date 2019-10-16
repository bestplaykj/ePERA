package com.kh.ePERA.guest.inHouseRequest.vo;

import java.sql.Date;

public class InHouseRequest {
	
	private int no;
	private String passCode;
	private int roomNo;
	private String request;
	private Date rTime;
	private String response;
	private Date aTime;
	private String status;
	
	
	public InHouseRequest() {}
	public InHouseRequest(int no, String passCode, int roomNo, String request, Date rTime, String response, Date aTime, String status) {
		this.no = no;
		this.passCode = passCode;
		this.roomNo = roomNo;
		this.request = request;
		this.rTime = rTime;
		this.response = response;
		this.aTime = aTime;
		this.status = status;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public Date getrTime() {
		return rTime;
	}
	public void setrTime(Date rTime) {
		this.rTime = rTime;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Date getaTime() {
		return aTime;
	}
	public void setaTime(Date aTime) {
		this.aTime = aTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}//class
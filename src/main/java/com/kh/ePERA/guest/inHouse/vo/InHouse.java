package com.kh.ePERA.guest.inHouse.vo;

import java.sql.Date;

public class InHouse {
	
	private String passcode;
	private int floor;
	private int roomNo;
	private String guest;
	private int ppl;
	private String contractor;
	private Date iDate;
	private Date oDate;
	private String status;
	
	
	public InHouse() {}
	public InHouse(String passcode, int floor, int roomNo, String guest, int ppl, String contractor, Date iDate, Date oDate, String status) {
		this.passcode = passcode;
		this.floor = floor;
		this.roomNo = roomNo;
		this.guest = guest;
		this.ppl = ppl;
		this.contractor = contractor;
		this.iDate = iDate;
		this.oDate = oDate;
		this.status = status;
	}
	
	
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
	}
	public int getPpl() {
		return ppl;
	}
	public void setPpl(int ppl) {
		this.ppl = ppl;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public Date getiDate() {
		return iDate;
	}
	public void setiDate(Date iDate) {
		this.iDate = iDate;
	}
	public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InHouse [passcode=" + passcode + ", floor=" + floor + ", roomNo=" + roomNo + ", guest=" + guest
				+ ", contractor=" + contractor + ", iDate=" + iDate + ", oDate=" + oDate + ", status=" + status + "]";
	}
	
	
	

}//class
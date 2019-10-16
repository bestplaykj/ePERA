package com.kh.ePERA.reservation.model.vo;

import java.sql.Date;

public class Reservation {
	
	private int no;
	private String guest;
	private Date iDate;
	private Date oDate;
	private int night;
	private int ppl;
	private String roomType;
	private int price;
	private int sales;
	private String contractor;
	private String note;
	private String status;
	
	
	public Reservation() {}
	public Reservation(int no, String guest, Date iDate, Date oDate, int night, int ppl, String roomType, int price, int sales, String contractor, String note, String status) {
		this.no = no;
		this.guest = guest;
		this.iDate = iDate;
		this.oDate = oDate;
		this.night = night;
		this.ppl = ppl;
		this.roomType = roomType;
		this.price = price;
		this.sales = sales;
		this.contractor = contractor;
		this.note = note;
		this.status = status;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
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
	public int getNight() {
		return night;
	}
	public void setNight(int night) {
		this.night = night;
	}
	public int getPpl() {
		return ppl;
	}
	public void setPpl(int ppl) {
		this.ppl = ppl;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}//class
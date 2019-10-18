package com.kh.ePERA.room.model.vo;

public class Room {
	
	private int no;
	private int floor;
	private String type;
	private String king;
	private int kBed;
	private String queen;
	private int qBed;
	private int capacity;
	private int price;
	private String smoking;
	private String status;
	
	
	public Room() {}
	public Room(int no, int floor, String type, String king, int kBed, String queen, int qBed, int capacity, int price, String smoking, String status) {
		super();
		this.no = no;
		this.floor = floor;
		this.type = type;
		this.king = king;
		this.kBed = kBed;
		this.queen = queen;
		this.qBed = qBed;
		this.capacity = capacity;
		this.price = price;
		this.smoking = smoking;
		this.status = status;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKing() {
		return king;
	}
	public void setKing(String king) {
		this.king = king;
	}
	public int getkBed() {
		return kBed;
	}
	public void setkBed(int kBed) {
		this.kBed = kBed;
	}
	public String getQueen() {
		return queen;
	}
	public void setQueen(String queen) {
		this.queen = queen;
	}
	public int getqBed() {
		return qBed;
	}
	public void setqBed(int qBed) {
		this.qBed = qBed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Room [floor=" + floor + ", type=" + type + ", king=" + king + ", kBed=" + kBed + ", queen=" + queen
				+ ", qBed=" + qBed + ", capacity=" + capacity + ", price=" + price + ", smoking=" + smoking + "]";
	}
	
}//class
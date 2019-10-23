package com.kh.ePERA.guest.inHouse.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.guest.inHouse.vo.InHouse;

public interface InHouseService {
	
	int checkIn(InHouse ih);
	
	int updateInHouse(InHouse ih);
	
	int checkOut(String passcode);
	
	ArrayList<InHouse> getAllInHouses();
	
	ArrayList<InHouse> getAllInHousesByFloor(int floor);
	
	ArrayList<InHouse> getAllInHousesIncOut();
	
	ArrayList<InHouse> getAllInHousesIncOut(Date date, int duration);
	
	int checkPassCode(String passcode);
	
	InHouse getInHouseDetail(String passcode);
	
	
}//interface
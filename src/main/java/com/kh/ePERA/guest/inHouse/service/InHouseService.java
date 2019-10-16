package com.kh.ePERA.guest.inHouse.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.guest.inHouse.vo.InHouse;

public interface InHouseService {
	
	String createPassCode();
	
	int checkIn(InHouse ih);
	
	int updateInHouse(InHouse ih);
	
	int checkOut(InHouse ih);
	
	ArrayList<InHouse> getAllInHouses();
	
	ArrayList<InHouse> getAllInHousesIncOut(Date date, int duration);
	
}//interface
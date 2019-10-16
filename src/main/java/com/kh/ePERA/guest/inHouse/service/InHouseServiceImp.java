package com.kh.ePERA.guest.inHouse.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.guest.inHouse.dao.InHouseDAO;
import com.kh.ePERA.guest.inHouse.vo.InHouse;

@Service("ihs")
public class InHouseServiceImp implements InHouseService{

	@Autowired
	private InHouseDAO ihd;
	
	
	@Override
	public String createPassCode() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int checkIn(InHouse ih) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int updateInHouse(InHouse ih) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int checkOut(InHouse ih) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public ArrayList<InHouse> getAllInHouses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<InHouse> getAllInHousesIncOut(Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}//class
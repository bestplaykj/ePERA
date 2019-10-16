package com.kh.ePERA.guest.inHouseRequest.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.guest.inHouse.vo.InHouse;
import com.kh.ePERA.guest.inHouseRequest.dao.InHouseRequestDAO;
import com.kh.ePERA.guest.inHouseRequest.vo.InHouseRequest;

@Service("ihrs")
public class InHouseRequestServiceImp implements InHouseRequestService{

	@Autowired
	private InHouseRequestDAO ihrd;
	
	
	@Override
	public InHouse signIn(String passCode) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<InHouseRequest> getAllInHouseRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<InHouseRequest> getAllInHouseRequests(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int requestIHR(InHouseRequest ihr) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public InHouseRequest getInHouseRequest(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int responseToIHR(InHouseRequest ihr) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}//class
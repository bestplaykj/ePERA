package com.kh.ePERA.guest.inHouseRequest.service;

import java.util.ArrayList;

import com.kh.ePERA.guest.inHouse.vo.InHouse;
import com.kh.ePERA.guest.inHouseRequest.vo.InHouseRequest;

public interface InHouseRequestService {
	
	InHouse signIn(String passCode);
	
	ArrayList<InHouseRequest> getAllInHouseRequests();
	
	ArrayList<InHouseRequest> getAllInHouseRequests(int no);
	
	int requestIHR(InHouseRequest ihr);
	
	InHouseRequest getInHouseRequest(int no);
	
	int responseToIHR(InHouseRequest ihr);

}//interface
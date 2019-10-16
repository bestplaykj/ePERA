package com.kh.ePERA.guest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.ePERA.guest.inHouse.service.InHouseService;
import com.kh.ePERA.guest.inHouseRequest.service.InHouseRequestService;
import com.kh.ePERA.guest.inHouseRequest.vo.InHouseRequest;

@Controller
public class GuestController {
	
	@Autowired
	private InHouseService ihs;
	
	@Autowired
	private InHouseRequestService ihrs;
	
	
	//-----------------------------------------------
	
	public ArrayList<InHouseRequest> getAllIHRs() {
		
		
		return null;
	}//getAllIHRs
	
	
	
	

}//class
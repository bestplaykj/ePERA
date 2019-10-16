package com.kh.ePERA.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.ePERA.guest.inHouse.service.InHouseService;
import com.kh.ePERA.guest.inHouseRequest.service.InHouseRequestService;

@Controller
public class GuestController {
	
	@Autowired
	private InHouseService ihs;
	
	@Autowired
	private InHouseRequestService ihrs;
	

}//class
package com.kh.ePERA.reservation.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ePERA.reservation.model.service.ReservationService;
import com.kh.ePERA.reservation.model.vo.Reservation;
import com.kh.ePERA.room.model.service.RoomService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService rsvs;
	
	@Autowired
	private RoomService rooms;
	
	
	@RequestMapping("getAllReservation.do")
	public ModelAndView getAllReservation(ModelAndView mv) {
		
		ArrayList<Reservation> ar = rsvs.getAllReservations();
		ArrayList<String> types = rooms.getRoomType();
		
		mv.addObject("list", ar).addObject("types", types).setViewName("reservation/main");
		
		return mv;
		
	}//getAllReservation
	
	
	@RequestMapping("createRSV.do")
	public void createRSVJSP(Reservation r) {
		
		
		
	}//createRSVJSP
	
	

}//class
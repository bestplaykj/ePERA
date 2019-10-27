package com.kh.ePERA.reservation.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.kh.ePERA.reservation.model.service.ReservationService;
import com.kh.ePERA.reservation.model.vo.Reservation;
import com.kh.ePERA.room.model.service.RoomService;
import com.kh.ePERA.room.model.vo.Room;

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
	
	
	@RequestMapping("getRSVpirce.do")
	public void getRSVpirce(HttpServletResponse response, String type) throws JsonIOException, IOException {
		
		response.setContentType("application/json; charset=utf-8");
		int price = rooms.getRoomPrice(type);
		
		Gson gs = new Gson();
		gs.toJson(price, response.getWriter());
		
	}//getRSVpirce
	
	
	@RequestMapping("createRSV.do")
	public ModelAndView createRSVJSP(Reservation r, ModelAndView mv) {
		
		int result = rsvs.createReservation(r);
		if(result > 0) {
			mv.setViewName("redirect:getAllReservation.do");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//createRSVJSP
	
	
	@RequestMapping("getRSVDetail.do")
	public ModelAndView getRSVDetail(int no, ModelAndView mv) {
		
		Reservation r = rsvs.getReservation(no);
		ArrayList<String> types = rooms.getRoomType();
		
		mv.addObject("rsv", r).addObject("types", types).setViewName("reservation/rsvDetail");
		
		return mv;
		
	}//getRSVDetail
	
	
	@RequestMapping("getAllRSV.do")
	public ModelAndView getAllRSV(ModelAndView mv) {
		
		ArrayList<Reservation> ar = rsvs.getAllReservationsIncAll();
		ArrayList<String> types = rooms.getRoomType();
		
		mv.addObject("list", ar).addObject("types", types).setViewName("reservation/showAll");
		
		return mv;
		
	}//getAllRSV
	
	
	@RequestMapping("updateRSV.do")
	public ModelAndView updateRSV(Reservation r, ModelAndView mv) {
		
		int result = rsvs.updateReservation(r);
		if(result > 0) {
			Reservation rsv = rsvs.getReservation(r.getNo());
			ArrayList<String> types = rooms.getRoomType();
			mv.addObject("rsv", rsv).addObject("types", types).setViewName("reservation/rsvDetail");
		}else {
			mv.setViewName("common/error");
		}
				
		return mv;
		
	}//updateRSV
	
	
	@RequestMapping("ciRSV.do")
	public ModelAndView checkIn(int no, ModelAndView mv) {
		
		int result = rsvs.checkIn(no);
		if(result > 0) {
			Reservation rsv = rsvs.getReservation(no);
			ArrayList<String> types = rooms.getRoomType();
			mv.addObject("rsv", rsv).addObject("types", types).setViewName("reservation/rsvDetail");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//checkIn
	
	
	@RequestMapping("coRSV.do")
	public ModelAndView checkOut(int no, ModelAndView mv) {
		
		int result = rsvs.checkOut(no);
		if(result > 0) {
			Reservation rsv = rsvs.getReservation(no);
			ArrayList<String> types = rooms.getRoomType();
			mv.addObject("rsv", rsv).addObject("types", types).setViewName("reservation/rsvDetail");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//checkOut
	
	
	@RequestMapping("cancelRSV.do")
	public ModelAndView cancelRSV(int no, ModelAndView mv) {
		
		int result = rsvs.cancelReservation(no);
		if(result > 0) {
			Reservation rsv = rsvs.getReservation(no);
			ArrayList<String> types = rooms.getRoomType();
			mv.addObject("rsv", rsv).addObject("types", types).setViewName("reservation/rsvDetail");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//cancelRSV
	
	
	@RequestMapping("deleteRSV.do")
	public ModelAndView deleteRSV(int no, ModelAndView mv) {
		
		int result = rsvs.deleteReservation(no);
		if(result > 0) {
			mv.setViewName("redirect:getAllReservation.do");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//deleteRSV
	
	
	@RequestMapping("getEmptyRooms.do")
	public void getEmptyRooms(HttpServletResponse response) throws JsonIOException, IOException {
		
		ArrayList<Room> ar = rooms.getEmptyRooms();
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(ar, response.getWriter());
		
	}//getEmptyRooms
	
	
	

}//class
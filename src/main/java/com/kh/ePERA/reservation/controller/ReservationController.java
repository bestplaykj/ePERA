package com.kh.ePERA.reservation.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.kh.ePERA.accounting.controller.AccountingController;
import com.kh.ePERA.accounting.revenue.service.RevenueService;
import com.kh.ePERA.accounting.revenue.service.RevenueServiceImp;
import com.kh.ePERA.accounting.revenue.vo.Revenue;
import com.kh.ePERA.guest.controller.GuestController;
import com.kh.ePERA.guest.inHouse.service.InHouseService;
import com.kh.ePERA.guest.inHouse.vo.InHouse;
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
	
	@Autowired
	private InHouseService ihs;
	
	@Autowired
	private RevenueService revs;
	
	
	@RequestMapping("getAllReservation.do")
	public ModelAndView getAllReservation(ModelAndView mv) {
		
		ArrayList<Reservation> ar = rsvs.getAllReservations();
		ArrayList<String> types = rooms.getRoomType();
		
		mv.addObject("list", ar).addObject("types", types).setViewName("reservation/main");
		
		return mv;
		
	}//getAllReservation
	
	
	@ResponseBody
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
	public ModelAndView checkIn(int no, int floor, int roomNo, ModelAndView mv) {
		
		Reservation r = rsvs.getReservation(no);

		InHouse ih = new InHouse();
		
		GuestController gc = new GuestController();
		String passcode = gc.createPassCode();
		
		while(true) {	
			int result = ihs.checkPassCode(passcode);
			if(result > 0) {
				passcode = gc.createPassCode();
			}else {
				ih.setPasscode(passcode);
				break;
			}
		}
		
		ih.setFloor(floor);
		ih.setRoomNo(roomNo);
		ih.setGuest(r.getGuest());
		ih.setPpl(r.getPpl());
		ih.setContractor(r.getContractor());
		ih.setiDate(r.getiDate());
		ih.setoDate(r.getoDate());
		
		//---------- revenue setting ----------
		Revenue rev = new Revenue();
		
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		rev.setYear(Integer.parseInt(year.format(r.getiDate())));
		
		SimpleDateFormat month = new SimpleDateFormat("MM");
		switch (month.format(r.getiDate())) {
		case "01": rev.setQuarter(1); rev.setMonth(1); break;
		case "02": rev.setQuarter(1); rev.setMonth(2); break;
		case "03": rev.setQuarter(1); rev.setMonth(3); break;
		case "04": rev.setQuarter(2); rev.setMonth(4); break;
		case "05": rev.setQuarter(2); rev.setMonth(5); break;
		case "06": rev.setQuarter(2); rev.setMonth(6); break;
		case "07": rev.setQuarter(3); rev.setMonth(7); break;
		case "08": rev.setQuarter(3); rev.setMonth(8); break;
		case "09": rev.setQuarter(3); rev.setMonth(9); break;
		case "10": rev.setQuarter(4); rev.setMonth(10); break;
		case "11": rev.setQuarter(4); rev.setMonth(11); break;
		case "12": rev.setQuarter(4); rev.setMonth(12); break;
		default:
			break;
		}
		
		rev.setiDate(r.getiDate());
		rev.setIncome(r.getSales());
		rev.setNote((String.valueOf(ih.getRoomNo())));
		
		//-------------- /revenue setting ----------------------
		
		
		int result = rsvs.checkIn(ih);
		if(result > 0) {
			revs.insertRevenue(rev);
			
			int result2 = rsvs.checkInStatus(no);
			if(result2 > 0) {
				ArrayList<String> types = rooms.getRoomType();
				mv.addObject("rsv", r).addObject("types", types).setViewName("reservation/rsvDetail");
			}
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
	
	
	@ResponseBody
	@RequestMapping("getEmptyRooms.do")
	public void getEmptyRooms(HttpServletResponse response) throws JsonIOException, IOException {
		
		ArrayList<Room> ar = rooms.getEmptyRooms();
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(ar, response.getWriter());
		
	}//getEmptyRooms
	
	
	@ResponseBody
	@RequestMapping("getFloor.do")
	public void getFloor(HttpServletResponse response, int roomNo) throws JsonIOException, IOException {
		
		int floor = rooms.getFloor(roomNo);
		
		response.setContentType("application/json; charset=utf-8");
		
		Gson gs = new Gson();
		gs.toJson(floor, response.getWriter());
		
	}//getFloor
	
	
	

}//class
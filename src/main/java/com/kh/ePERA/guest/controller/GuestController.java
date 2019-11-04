package com.kh.ePERA.guest.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ePERA.accounting.controller.AccountingController;
import com.kh.ePERA.accounting.revenue.service.RevenueService;
import com.kh.ePERA.accounting.revenue.vo.Revenue;
import com.kh.ePERA.guest.inHouse.service.InHouseService;
import com.kh.ePERA.guest.inHouse.vo.InHouse;
import com.kh.ePERA.guest.inHouseRequest.service.InHouseRequestService;
import com.kh.ePERA.room.model.service.RoomService;
import com.kh.ePERA.room.model.vo.Room;

@SessionAttributes("passcode")
@Controller
public class GuestController {
	
	@Autowired
	private InHouseService ihs;
	
	@Autowired
	private InHouseRequestService ihrs;
	
	@Autowired
	private RoomService rooms;
	
	@Autowired
	private RevenueService revs;
	
	
	//-----------------------------------------------
	
	@RequestMapping("getRoomStatus.do")
	public ModelAndView getRoomStatus(ModelAndView mv) {
		
		int min = rooms.getLowestFloorLevel();
		int max = rooms.getHighestFloorLevel();
		int floorNo = (max-min)+1;
		int[] floor = new int[3];
		floor[0] = min;
		floor[1] = max;
		floor[2] = floorNo;
		
		ArrayList<ArrayList<Room>> ar = new ArrayList<ArrayList<Room>>();
		
		for(int i=min; i<max+1; i++) {
			ArrayList<Room> arr = rooms.getAllRoomsByFloor(i);
			ar.add(arr);
		}
		
		ArrayList<InHouse> iar = ihs.getAllInHouses();
		
		mv.addObject("floor", floor).addObject("list", ar).addObject("inhouse", iar).setViewName("guest/inhouse/main");
		
		return mv;
		
	}//getRoomStatus
	
	
	public String createPassCode() {
		
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 8; i++) {
		    int rIndex = rnd.nextInt(3);
		    switch (rIndex) {
		    case 0:
		        // a-z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 97));
		        break;
		    case 1:
		        // A-Z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 65));
		        break;
		    case 2:
		        // 0-9
		        temp.append((rnd.nextInt(10)));
		        break;
		    }
		}
				
		return temp.toString();
		
	}//createPassCode
	
	
	@RequestMapping("checkInGuest.do")
	public String checkInGuest(InHouse ih, Model model) {
		
		String passcode = createPassCode();
		int result = 0;
		while(true) {	
			result = ihs.checkPassCode(passcode);
			if(result > 0) {
				passcode = createPassCode();
			}else {
				ih.setPasscode(passcode);
				break;
			}
		}
		
		result = ihs.checkIn(ih);
		if(result > 0) {
			//------------------- revenue setting --------------------------
			Revenue rev = new Revenue();
			
			SimpleDateFormat year = new SimpleDateFormat("yyyy");
			rev.setYear(Integer.parseInt(year.format(ih.getiDate())));
			
			SimpleDateFormat month = new SimpleDateFormat("MM");
			switch (month.format(ih.getiDate())) {
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
			
			rev.setiDate(ih.getiDate());
			
			long diff = (ih.getoDate().getTime() - ih.getiDate().getTime());
			int night = Math.round((((diff/1000)/60)/60)/24);
			int price = rooms.getRoomPrice(ih.getRoomNo());
			rev.setIncome(price*night);
			
			AccountingController ac = new AccountingController();
			revs.insertRevenue(rev);
			//------------------- /revenue setting --------------------------
			model.addAttribute("passcode", ih.getPasscode());
			return "redirect:getRoomStatus.do";
		}else {
			return "common/error";
		}
		
	}//checkInGuest
	
	
	@RequestMapping("getInHouseDetail.do")
	public ModelAndView getInHouseDetail(String passcode, ModelAndView mv) {
		
		InHouse ih = ihs.getInHouseDetail(passcode);
		
		mv.addObject("inhouse", ih).setViewName("guest/inhouse/ihDetail");
		
		return mv;
		
	}//getInHouseDetail
	
	
	@RequestMapping("updateIHDetail.do")
	public ModelAndView updateIHDetail(InHouse ih, ModelAndView mv) {
		
		int result = ihs.updateInHouse(ih);
		if(result > 0) {
			InHouse update = ihs.getInHouseDetail(ih.getPasscode());
			mv.addObject("inhouse", update).setViewName("redirect:getRoomStatus.do");
		}else {
			mv.setViewName("common/error");
		}
		
		return mv;
		
	}//updateIHDetail
	
	
	@RequestMapping("checkOutIH.do")
	public String checkOutIH(String passcode) {
		
		int result = ihs.checkOut(passcode);
		if(result > 0) {
			return "redirect:getRoomStatus.do";
		}else {
			return "common/error";
		}
		
	}//checkOutIH
	
	
	@RequestMapping("showAllIH.do")
	public ModelAndView showAllIH(ModelAndView mv) {
		
		int min = rooms.getLowestFloorLevel();
		int max = rooms.getHighestFloorLevel();
		int floorNo = (max-min)+1;
		int[] floor = new int[3];
		floor[0] = min;
		floor[1] = max;
		floor[2] = floorNo;
				
		ArrayList<InHouse> iar = ihs.getAllInHousesIncOut();
		
		mv.addObject("floor", floor).addObject("inhouse", iar).setViewName("guest/inhouse/showAll");
		
		return mv;
		
	}//showAllIH
	
	
	
	

}//class
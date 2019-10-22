package com.kh.ePERA.guest.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

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
			model.addAttribute("passcode", ih.getPasscode());
			return "redirect:getRoomStatus.do";
		}else {
			return "common/error";
		}
		
	}//checkInGuest
	
	
	
	
	
	
	

}//class
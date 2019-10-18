package com.kh.ePERA.room.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ePERA.room.model.service.RoomService;
import com.kh.ePERA.room.model.vo.Room;

@Controller
public class RoomController {
	
	@Autowired
	private RoomService rooms;
	
	
	//------------------------------------------------------------------------------
	
	@RequestMapping("managerRoomMain.do")
	public ModelAndView roomMain(ModelAndView mv) {
		
		int max = rooms.getHighestFloorLevel();
		int min = rooms.getLowestFloorLevel();
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
		
		mv.addObject("floor", floor).addObject("list", ar).setViewName("hotelManagement/main");
		
		return mv;
		
	}//roomMain
	
	
	@RequestMapping("getRoomDetail.do")
	public ModelAndView getRoomDetail(int roomNo, ModelAndView mv) {
		
		Room r = rooms.getRoom(roomNo);
		mv.addObject("room", r).setViewName("hotelManagement/roomDetail");
		
		return mv;
		
	}//getRoomDetail
	
	
	@RequestMapping("createRoomJSP.do")
	public String createRoomJSP() {
		
		return "hotelManagement/createRoom";
		
	}//createRoom
	
	
	@RequestMapping("createRoom.do")
	public String createRoom(Room r) {
		
		
		return "redirect:managerRoomMain.do";
		
	}//createRoom
	
	
	
	

}//class
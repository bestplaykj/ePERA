package com.kh.ePERA.room.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.room.model.dao.RoomDAO;
import com.kh.ePERA.room.model.vo.Room;

@Service("rooms")
public class RoomServiceImp implements RoomService{

	@Autowired
	private RoomDAO roomd;
	
	
	@Override
	public int createRoom(Room r) {
		
		return roomd.createRoom(r);
		
	}//createRoom

	
	@Override
	public int updateRoom(Room r) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int deleteRoom(Room r) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public ArrayList<Room> getAllRooms() {
		
		return roomd.getAllRooms();
		
	}//getAllRooms
	

	@Override
	public ArrayList<Room> getAllRoomsByFloor(int floor) {
		
		return roomd.getAllRoomsByFloor(floor);
	
	}//getAllRoomsByFloor


	@Override
	public ArrayList<Room> getRoomsByFloor(int floor) {
		
		return null;
		
	}


	@Override
	public int getLowestFloorLevel() {
		
		return roomd.getLowestFloorLevel();
		
	}//getLowestFloorLevel


	@Override
	public int getHighestFloorLevel() {
		
		return roomd.getHighestFloorLevel();
		
	}//getHighestFloorLevel
	
	
	public Room getRoom(int roomNo) {
		
		return roomd.getRoom(roomNo);
		
	}//getRoom
	
	
}//class
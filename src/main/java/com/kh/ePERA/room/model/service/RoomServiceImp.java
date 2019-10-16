package com.kh.ePERA.room.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.room.model.dao.RoomDAO;
import com.kh.ePERA.room.model.vo.Room;

@Service("rs")
public class RoomServiceImp implements RoomService{

	@Autowired
	private RoomDAO rd;
	
	@Override
	public int createRoom(Room r) {
		// TODO Auto-generated method stub
		return 0;
	}

	
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
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public ArrayList<Room> getRoomsByFloor(int floor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}//class
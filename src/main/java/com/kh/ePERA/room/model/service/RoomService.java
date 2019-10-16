package com.kh.ePERA.room.model.service;

import java.util.ArrayList;

import com.kh.ePERA.room.model.vo.Room;

public interface RoomService {
	
	int createRoom(Room r);
	
	int updateRoom(Room r);
	
	int deleteRoom(Room r);
	
	ArrayList<Room> getAllRooms();
	
	ArrayList<Room> getRoomsByFloor(int floor);

}//interface
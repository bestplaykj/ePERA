package com.kh.ePERA.room.model.service;

import java.util.ArrayList;

import com.kh.ePERA.room.model.vo.Room;

public interface RoomService {
	
	int createRoom(Room r);
	
	int updateRoom(Room r);
	
	int deleteRoom(int roomNo);
	
	ArrayList<Room> getAllRooms();
	
	ArrayList<Room> getAllRoomsByFloor(int floor);
	
	ArrayList<Room> getRoomsByFloor(int floor);
	
	int getLowestFloorLevel();
	
	int getHighestFloorLevel();
	
	Room getRoom(int roomNo);
	
	ArrayList<String> getRoomType();
	
	int getRoomPrice(String type);
	
	ArrayList<Room> getEmptyRooms();
	
	int getFloor(int roomNo);
	
	int getRoomPrice(int roomNo);

}//interface
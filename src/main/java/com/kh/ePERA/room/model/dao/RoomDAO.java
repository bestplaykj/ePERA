package com.kh.ePERA.room.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.room.model.vo.Room;


@Repository("roomd")
public class RoomDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Room> getAllRooms() {
		
		return (ArrayList)sqlSession.selectList("roomMapper.getAllRooms");
		
	}//getAllRooms
	
	
	public ArrayList<Room> getAllRoomsByFloor(int floor) {
		
		return (ArrayList)sqlSession.selectList("roomMapper.getAllRoomsByFloor", floor);
		
	}//getAllRoomsByFloor
	
	
	public int getLowestFloorLevel() {
		
		return sqlSession.selectOne("roomMapper.getLowestFloorLevel");
		
	}//getHighestFloorLevel
	
	
	public int getHighestFloorLevel() {
		
		return sqlSession.selectOne("roomMapper.getHighestFloorLevel");
		
	}//getHighestFloorLevel
	
	
	public Room getRoom(int roomNo) {
		
		return sqlSession.selectOne("roomMapper.getRoom", roomNo);
		
	}//getRoom
	
	
	public int createRoom(Room r) {
		
		return sqlSession.insert("roomMapper.createRoom", r);
		
	}//createRoom
	
	
	public int updateRoom(Room r) {
		
		return sqlSession.update("roomMapper.updateRoom", r);
		
	}//updateRoom
	
	
	public int deleteRoom(int roomNo) {
		
		return sqlSession.delete("roomMapper.deleteRoom", roomNo);
		
	}//deleteRoom
	
	
	public ArrayList<String> getRoomType() {
		
		return (ArrayList)sqlSession.selectList("roomMapper.getRoomType");
		
	}//getRoomType
	
	
	public int getRoomPrice(String type) {
		
		return sqlSession.selectOne("roomMapper.getRoomPrice", type);
		
	}//getRoomPrice
	
	
	public ArrayList<Room> getEmptyRooms() {
		
		return (ArrayList)sqlSession.selectList("roomMapper.getEmptyRooms");
		
	}//getEmptyRooms
	
	
	public int getFloor(int roomNo) {
		
		return sqlSession.selectOne("roomMapper.getFloor", roomNo);
		
	}//getFloor
	

}//class
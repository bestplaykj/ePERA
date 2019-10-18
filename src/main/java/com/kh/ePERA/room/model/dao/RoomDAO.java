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
	

}//class
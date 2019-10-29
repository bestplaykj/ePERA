package com.kh.ePERA.reservation.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ePERA.guest.inHouse.vo.InHouse;
import com.kh.ePERA.reservation.model.vo.Reservation;

@Repository("rsvd")
public class ReservationDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public ArrayList<Reservation> getAllReservations() {
		
		return (ArrayList)sqlSession.selectList("reservationMapper.getAllReservations");
		
	}//getAllReservations
	
	
	public int createReservation(Reservation r) {
		
		return sqlSession.insert("reservationMapper.createReservation", r);
		
	}//createReservation
	
	
	public Reservation getReservation(int no) {
		
		return sqlSession.selectOne("reservationMapper.getReservation", no);
		
	}//getReservation
	
	
	public ArrayList<Reservation> getAllReservationsIncAll() {
		
		return (ArrayList)sqlSession.selectList("reservationMapper.getAllReservationsIncAll");
		
	}//getAllReservationsIncAll
	
	
	public int updateReservation(Reservation r) {
		
		return sqlSession.update("reservationMapper.updateReservation", r);
		
	}//updateReservation
	
	
	public int checkIn(InHouse ih) {
		
		return sqlSession.update("inhouseMapper.checkIn", ih);
		
	}//checkIn
	
	
	public int checkInStatus(int no) {
		
		return sqlSession.update("reservationMapper.checkIn", no);
		
	}//checkInStatus
	
	
	public int checkOut(int no) {
		
		return sqlSession.update("reservationMapper.checkOut", no);
		
	}//checkOut
	
	
	public int cancelReservation(int no) {
		
		return sqlSession.update("reservationMapper.cancelReservation", no);
		
	}//cancelReservation
	
	
	public int deleteReservation(int no) {
		
		return sqlSession.delete("reservationMapper.deleteReservation", no);
		
	}//deleteReservation
	
	

}//class
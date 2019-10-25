package com.kh.ePERA.reservation.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	
	
	
	

}//class
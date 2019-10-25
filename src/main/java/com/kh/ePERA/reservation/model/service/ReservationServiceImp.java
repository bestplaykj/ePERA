package com.kh.ePERA.reservation.model.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.reservation.model.dao.ReservationDAO;
import com.kh.ePERA.reservation.model.vo.Reservation;

@Service("rsvs")
public class ReservationServiceImp implements ReservationService{
	
	@Autowired
	private ReservationDAO rsvd;

	
	@Override
	public int createReservation(Reservation r) {
		
		return rsvd.createReservation(r);
		
	}//createReservation

	
	@Override
	public int updateReservation(Reservation r) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int handlingReservation(Reservation r, String note) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int deleteReservation(int no) {
		// TODO Auto-generated method stub
		return 0;
	}
	
		
	@Override
	public Reservation getReservation(int no) {
		
		return rsvd.getReservation(no);
		
	}//getReservation


	@Override
	public ArrayList<Reservation> getAllReservations() {
		
		return rsvd.getAllReservations();
		
	}//ArrayList<Reservation>
	
	
	@Override
	public ArrayList<Reservation> getAllReservationsIncAll() {
		
		return rsvd.getAllReservationsIncAll();
		
	}//getAllReservationsIncAll


	@Override
	public ArrayList<Reservation> getReservationsByRoom(int roomNo, Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Reservation> getReservationsByDate(Date date, int duration) {
		// TODO Auto-generated method stub
		return null;
	}
	

}//class
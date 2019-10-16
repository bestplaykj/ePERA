package com.kh.ePERA.reservation.model.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ePERA.reservation.model.dao.ReservationDAO;
import com.kh.ePERA.reservation.model.vo.Reservation;

@Service("rs")
public class ReservationServiceImp implements ReservationService{
	
	@Autowired
	private ReservationDAO rd;

	
	@Override
	public int createReservation(Reservation r) {
		// TODO Auto-generated method stub
		return 0;
	}

	
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
	public ArrayList<Reservation> getAllReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	
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
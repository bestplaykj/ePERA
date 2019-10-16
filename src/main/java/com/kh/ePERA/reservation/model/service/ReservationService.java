package com.kh.ePERA.reservation.model.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.reservation.model.vo.Reservation;

public interface ReservationService {
	
	int createReservation(Reservation r);
	
	int updateReservation(Reservation r);
	
	int handlingReservation(Reservation r, String note);
	
	int deleteReservation(int no);
	
	ArrayList<Reservation> getAllReservations();
	
	ArrayList<Reservation> getReservationsByRoom(int roomNo, Date date, int duration);
	
	ArrayList<Reservation> getReservationsByDate(Date date, int duration);

}//interface
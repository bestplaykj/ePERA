package com.kh.ePERA.reservation.model.service;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ePERA.guest.inHouse.vo.InHouse;
import com.kh.ePERA.reservation.model.vo.Reservation;

public interface ReservationService {
	
	int createReservation(Reservation r);
	
	int updateReservation(Reservation r);
	
	int checkIn(InHouse ih);
	
	int checkInStatus(int no);
	
	int checkOut(int no);
	
	int cancelReservation(int no);
	
	int handlingReservation(int no, String note);
	
	int deleteReservation(int no);
	
	Reservation getReservation(int no);
	
	ArrayList<Reservation> getAllReservations();
	
	ArrayList<Reservation> getAllReservationsIncAll();
	
	ArrayList<Reservation> getReservationsByRoom(int roomNo, Date date, int duration);
	
	ArrayList<Reservation> getReservationsByDate(Date date, int duration);

}//interface
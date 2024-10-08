package com.ani.home.repo;

import java.util.List;
import java.util.Optional;

import com.ani.home.model.Booking;


public interface BookingRepo {

	Booking save(Booking booking);

	Optional<Booking> findById(int bookingId);

	List<Booking> findAll();

	void deleteById(int bookingId);

	List<Booking> findByUserId(int userId);

	List<Booking> findBySlotChargingStationId(int stationId);

}

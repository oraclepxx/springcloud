package com.springlearning.service.flight.service;

import java.util.Collection;

import com.springlearning.service.flight.model.Flight;

public interface FlightService {

	public Collection<Flight> listFlights();

	public Flight getFlight(String flightId);
	
	public Collection<Flight> searchFlights(String from, String to);

}

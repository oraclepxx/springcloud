package com.springlearning.service.flight.repository;

import java.util.Collection;

import com.springlearning.service.flight.model.Flight;

public interface FlightRepo {

	public Collection<Flight> listFlights();

	public Flight getFlight(String flightId);

}

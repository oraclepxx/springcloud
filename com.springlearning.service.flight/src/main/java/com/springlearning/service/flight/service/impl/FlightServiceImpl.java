package com.springlearning.service.flight.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springlearning.service.flight.model.Flight;
import com.springlearning.service.flight.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	private static Map<String, Flight> flightMap;

	static {
		flightMap = new HashMap<String, Flight>();
		flightMap.put("1", new Flight("1", "a", "b", "2020-01-02", "del"));
		flightMap.put("2", new Flight("2", "a", "c", "2020-02-19", "ke"));
		flightMap.put("3", new Flight("3", "a", "d", "2020-11-11", "ua"));
		flightMap.put("4", new Flight("4", "d", "c", "2020-08-07", "ua"));
		flightMap.put("5", new Flight("5", "a", "c", "2020-08-07", "ca"));
		flightMap.put("6", new Flight("6", "a", "b", "2020-08-07", "ca"));
		flightMap.put("7", new Flight("7", "b", "c", "2020-08-07", "del"));
		flightMap.put("8", new Flight("8", "a", "c", "2020-08-07", "ua"));
		flightMap.put("9", new Flight("9", "d", "c", "2020-08-07", "ke"));
		
	}

	@Override
	public Collection<Flight> listFlights() {
		return this.flightMap.values();
	}

	@Override
	public Flight getFlight(String flightId) {
		return this.flightMap.get(flightId);
	}

	@Override
	public Collection<Flight> searchFlights(String from, String to) {
		if (from == null && to == null) {
			return this.flightMap.values();
		}
		
		Flight[] flights = null;
		
		if (from != null && to != null) {
			flights = this.flightMap.values().stream().filter(f -> from.equals(f.getFrom()) && to.equals(f.getTo())).toArray(Flight[]::new);
		}
		
		if (from != null && to == null) {
			flights = this.flightMap.values().stream().filter(f -> from.equals(f.getFrom())).toArray(Flight[]::new);
		}
		
		if (from == null && to != null) {
			flights = this.flightMap.values().stream().filter(f -> to.equals(f.getTo())).toArray(Flight[]::new);
		}
		
		return Arrays.asList(flights); 
	}
	

}

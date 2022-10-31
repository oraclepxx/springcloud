package com.springlearning.service.flight.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning.service.flight.model.Flight;
import com.springlearning.service.flight.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightService flightService;

	@GetMapping
	public Collection<Flight> listFlights(@RequestParam(name = "from", required = false) String from,
			@RequestParam(name = "to", required = false) String to) {
		return flightService.searchFlights(from, to);
	}

	@GetMapping("/{id}")
	public Flight getFlight(@PathVariable("id") String id) {
		return flightService.getFlight(id);
	}

}

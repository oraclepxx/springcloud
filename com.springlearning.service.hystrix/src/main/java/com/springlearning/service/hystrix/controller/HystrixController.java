package com.springlearning.service.hystrix.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning.service.hystrix.client.FlightFeignClient;
import com.springlearning.service.hystrix.client.HotelFeignClient;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

	@Autowired
	private FlightFeignClient flightFeignClient;

	@Autowired
	private HotelFeignClient hotelFeignClient;

	@GetMapping("/flights")
	public Collection getFlights() {
		return flightFeignClient.getFlights();
	}

	@GetMapping("/hotels")
	public Collection getHotels() {
		return hotelFeignClient.getHotels();
	}

}

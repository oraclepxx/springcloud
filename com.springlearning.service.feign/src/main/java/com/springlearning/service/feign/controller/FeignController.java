package com.springlearning.service.feign.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning.service.feign.client.FlightFeignClient;
import com.springlearning.service.feign.client.HotelFeignClient;

@RestController
@RequestMapping("/feign")
public class FeignController {

	@Autowired
	private FlightFeignClient flightClient;

	@Autowired
	private HotelFeignClient hotelClient;

	@GetMapping("/flights")
	public Collection getFlights() {
		return flightClient.getFlights();
	}

	@GetMapping("/hotels")
	public Collection getHotel() {
		return hotelClient.getHotels();
	}

}

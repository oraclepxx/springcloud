package com.springlearning.service.hotel.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning.service.hotel.model.Hotel;
import com.springlearning.service.hotel.service.HotelService;

@RestController
@CrossOrigin
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@Value("${server.port}")
	private String port;

	@GetMapping
	public Collection<Hotel> listAllHotels(@RequestParam(name="name", required = false) String name, @RequestParam(name="zipcode", required = false) String zipcode) {
		return hotelService.listHotels(name, zipcode);
	}
	
	@GetMapping("/index")
	public String getServerPort() {
		return this.port;
	}


}

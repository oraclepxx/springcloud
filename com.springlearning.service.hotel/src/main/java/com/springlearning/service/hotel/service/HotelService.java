package com.springlearning.service.hotel.service;

import java.util.Collection;

import com.springlearning.service.hotel.model.Hotel;

public interface HotelService {

	public Collection<Hotel> listHotels(String name, String zipcode);

}

package com.springlearning.service.hotel.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springlearning.service.hotel.model.Hotel;
import com.springlearning.service.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	private static Map<String, Hotel> hotelMap;

	static {
		hotelMap = new HashMap<String, Hotel>();
		hotelMap.put("1", new Hotel("1", "aaa", "94087"));
		hotelMap.put("2", new Hotel("2", "bbb", "94086"));
		hotelMap.put("3", new Hotel("3", "ccc", "94087"));
		hotelMap.put("4", new Hotel("4", "aaa", "94085"));
		hotelMap.put("5", new Hotel("5", "xyz", "94087"));
		hotelMap.put("6", new Hotel("6", "zzz", "94085"));
	}

	@Override
	public Collection<Hotel> listHotels(String name, String zipcode) {
		if (name == null && zipcode == null) {
			return this.hotelMap.values();
		}
		
		if (name != null && zipcode != null) {
			return searchHotels(name, zipcode);
		}
		
		if (name != null) {
			return listHotelsByName(name);
		}
		
		if (zipcode != null) {
			return listHotelsByZipcode(zipcode);
		}
		
		return Collections.EMPTY_LIST;
	}

	private Collection<Hotel> listHotelsByZipcode(String zipcode) {
		Hotel[] hotels = this.hotelMap.values().stream().filter(h -> zipcode.equals(h.getZipcode())).toArray(Hotel[]::new);
		return Arrays.asList(hotels);
	}

	private Collection<Hotel> listHotelsByName(String name) {
		Hotel[] hotels = this.hotelMap.values().stream().filter(h -> name.equals(h.getName())).toArray(Hotel[]::new);
		return Arrays.asList(hotels);
	}
	
	private Collection<Hotel> searchHotels(String name, String zipcode) {
		Hotel[] hotels = this.hotelMap.values().stream().filter(h -> zipcode.equals(h.getZipcode()) && name.equals(h.getName())).toArray(Hotel[]::new);
		return Arrays.asList(hotels);
	}
	
	

}

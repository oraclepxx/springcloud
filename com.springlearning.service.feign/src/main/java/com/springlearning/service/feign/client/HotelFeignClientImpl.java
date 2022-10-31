package com.springlearning.service.feign.client;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class HotelFeignClientImpl implements HotelFeignClient {

	@Override
	public Collection getHotels() {
		System.out.println("HotelService unavailable");
		return Collections.EMPTY_LIST;
	}

}

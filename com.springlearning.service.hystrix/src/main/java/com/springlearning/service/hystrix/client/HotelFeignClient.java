package com.springlearning.service.hystrix.client;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "HotelService")
public interface HotelFeignClient {

	@GetMapping("/hotels")
	public Collection getHotels();
	
}

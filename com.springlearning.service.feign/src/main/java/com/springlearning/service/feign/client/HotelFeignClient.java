package com.springlearning.service.feign.client;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "HotelService", fallback = HotelFeignClientImpl.class)
public interface HotelFeignClient {
	
	@GetMapping("/hotels")
	public Collection getHotels();

}

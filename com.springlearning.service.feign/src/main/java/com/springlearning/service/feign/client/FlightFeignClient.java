package com.springlearning.service.feign.client;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "FlightService", fallback = FlightFeignClientImpl.class)
public interface FlightFeignClient {
	
	@GetMapping("/flights")
	public Collection getFlights();

}

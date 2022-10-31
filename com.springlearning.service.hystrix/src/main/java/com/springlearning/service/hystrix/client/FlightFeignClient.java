package com.springlearning.service.hystrix.client;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="FlightService")
public interface FlightFeignClient {
	
	@GetMapping("/flights")
	public Collection getFlights();

}

package com.springlearning.service.feign.client;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class FlightFeignClientImpl implements FlightFeignClient {

	@Override
	public Collection getFlights() {
		System.out.println("FlightService unavailable");
		return Collections.EMPTY_LIST;
	}

}

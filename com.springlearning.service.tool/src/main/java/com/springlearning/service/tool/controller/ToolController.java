package com.springlearning.service.tool.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class ToolController {

	@Autowired
	private RestTemplate getRestTemplate;
	
	private static String host = "http://localhost:3000";
	
	@Value("${server.port}")
	private String port;
	
	@Value("${config.name}")
	private String configName;

	@GetMapping(value = "/hotels")
	public Collection listHotels(@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "zipcode", required = false) String zipcode) {

		String url = host + "/hotelserver/hotels";
		
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url);

		if (name != null) {
			uriBuilder.queryParam("name", name);
		}
		if (zipcode != null) {
			uriBuilder.queryParam("zipcode", zipcode);
		}

		return getRestTemplate.getForEntity(uriBuilder.toUriString(), Collection.class).getBody();
	}

	@GetMapping("/flights")
	public Collection listFlights(@RequestParam(name = "from", required = false) String from,
			@RequestParam(name = "to", required = false) String to) {
		String url = host + "/flightserver/flights";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url);
		if (from != null) {
			uriBuilder.queryParam("from", from);
		}
		if (to != null) {
			uriBuilder.queryParam("to", to);
		}
		return getRestTemplate.getForEntity(uriBuilder.toUriString(), Collection.class).getBody();
	}

	@GetMapping("/flights/{id}")
	public Object getFlight(@PathVariable("id") String id) {
		String url = host + "/flightserver/flights/" + id;
		return getRestTemplate.getForEntity(url, Object.class).getBody();
	}
	
	@GetMapping("/config")
	public String getConfig() {
		return this.configName + ": " + this.port;
	}

}

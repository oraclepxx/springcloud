package com.springlearning.service.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

	@Value("${server.port}")
	private String port;

	@Value("${config.name}")
	private String configName;

	@GetMapping("/name")
	public String getConfigName() {
		return this.configName;
	}
	
	@GetMapping("/port")
	public String getPort() {
		return this.port;
	}
	
	@GetMapping()
	public String getComb() {
		return this.configName + ": " + port;
	}
}

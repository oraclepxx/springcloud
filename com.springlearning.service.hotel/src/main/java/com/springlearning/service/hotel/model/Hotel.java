package com.springlearning.service.hotel.model;

public class Hotel {

	private String id;
	private String name;
	private String zipcode;

	public Hotel() {
	}

	public Hotel(String id, String name, String zipcode) {
		this.id = id;
		this.name = name;
		this.zipcode = zipcode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}

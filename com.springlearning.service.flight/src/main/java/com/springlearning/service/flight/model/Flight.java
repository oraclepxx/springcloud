package com.springlearning.service.flight.model;

public class Flight {

	private String id;
	private String from;
	private String to;
	private String date;
	private String airline;

	public Flight() {
	}

	public Flight(String id, String from, String to, String date, String airline) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.date = date;
		this.airline = airline;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

}

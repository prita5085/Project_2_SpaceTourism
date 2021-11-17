package com.revature.util;

public class FindFlights { 

	private long departureDate;
	private long arrivalDate;
	private String departureSpaceport;
	private String arrivalSpaceport;
	
	public FindFlights() {
		super();
	}
	
	public FindFlights(long departureDate, long arrivalDate, String departureSpaceport, String arrivalSpaceport) {
		super();
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureSpaceport = departureSpaceport;
		this.arrivalSpaceport = arrivalSpaceport;
	}

	public long getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(long departureDate) {
		this.departureDate = departureDate;
	}

	public long getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(long arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureSpaceport() {
		return departureSpaceport;
	}

	public void setDepartureSpaceport(String departureSpaceport) {
		this.departureSpaceport = departureSpaceport;
	}

	public String getArrivalSpaceport() {
		return arrivalSpaceport;
	}

	public void setArrivalSpaceport(String arrivalSpaceport) {
		this.arrivalSpaceport = arrivalSpaceport;
	}

	@Override
	public String toString() {
		return "FilterFlights [departureDate=" + departureDate + ", arrivalDate=" + arrivalDate
				+ ", departureSpaceport=" + departureSpaceport + ", arrivalSpaceport=" + arrivalSpaceport + "]";
	}
	
	
	
}


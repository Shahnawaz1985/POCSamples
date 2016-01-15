package com.bac.csd.bean;

import java.io.Serializable;
import java.util.Date;

public class RideBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6539925929195123763L;
	
	private String firstName;
	private String lastName;
	private String source;
	private String Destination;
	private String Email;
	private String phoneNo;
	private Date date;
	private String time;
	private boolean isBooked;
	private boolean isCancelled;
	private String bookingDetails;
	private String availabilityDetails;
	
	public RideBean(){
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public boolean isCancelled() {
		return isCancelled;
	}

	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public String getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(String bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public String getAvailabilityDetails() {
		return availabilityDetails;
	}

	public void setAvailabilityDetails(String availabilityDetails) {
		this.availabilityDetails = availabilityDetails;
	}		

}

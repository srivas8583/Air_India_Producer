package com.spring.AAi.operation.binding;

import jakarta.persistence.Entity;

@Entity
public class TicketBooked {
 
	private String FirstName;
	private String LastName;
	private String dob;
	private String traveldate;
	private String From;
	private String To;
	private Integer smId;
	private Integer TNumber;
	private String status;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public Integer getSmId() {
		return smId;
	}
	public void setSmId(Integer smId) {
		this.smId = smId;
	}
	public Integer getTNumber() {
		return TNumber;
	}
	public void setTNumber(Integer tNumber) {
		TNumber = tNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TicketBooked [FirstName=" + FirstName + ", LastName=" + LastName + ", dob=" + dob + ", traveldate="
				+ traveldate + ", From=" + From + ", To=" + To + ", smId=" + smId + ", TNumber=" + TNumber + ", status="
				+ status + "]";
	}
	
	
}

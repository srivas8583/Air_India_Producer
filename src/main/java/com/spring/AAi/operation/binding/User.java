package com.spring.AAi.operation.binding;



import jakarta.persistence.Entity;

@Entity
public class User {
   
	private String FirstName;
	private String LastName;
	private String dob;
	private String traveldate;
	private Integer smId;
	private String From;
	private String To;
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
	public Integer getSmId() {
		return smId;
	}
	public void setSmId(Integer smId) {
		this.smId = smId;
	}
	@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", dob=" + dob + ", traveldate=" + traveldate
				+ ", smId=" + smId + ", From=" + From + ", To=" + To + "]";
	}
	
	
}

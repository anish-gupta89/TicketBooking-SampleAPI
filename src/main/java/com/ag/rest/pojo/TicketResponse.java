package com.ag.rest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketResponse {

	@Override
	public String toString() {
		return "TicketResponse [fName=" + fName + ", lName=" + lName + ", address=" + address + ", trainNumber="
				+ trainNumber + ", fromStation=" + fromStation + ", toStation=" + toStation + ", doj=" + doj
				+ ", ticketStatus=" + ticketStatus + ", bookingAmount=" + bookingAmount + ", ticketId=" + ticketId
				+ "]";
	}
	String fName;
	String lName;
	String address;
	Integer trainNumber;
	String fromStation;
	String toStation;
	String doj;
	String ticketStatus;
	Double bookingAmount;
	String ticketId;
	
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
}

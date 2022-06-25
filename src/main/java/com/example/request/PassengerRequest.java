package com.example.request;

import lombok.Data;

@Data

public class PassengerRequest {
	private String name;
	private String email;
	private String phno;
	private String from;
	private String to;
	private String journeyDate;
	private Long   trainNum;

	/*
	 * public String getJourneyDate() { return journeyDate; } public void
	 * setJourneyDate(String journeyDate) { this.journeyDate = journeyDate; }
	 * 
	 * 
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getEmail() { return email; } public void
	 * setEmail(String email) { this.email = email; } public String getPhno() {
	 * return phno; } public void setPhno(String phno) { this.phno = phno; } public
	 * String getFrom() { return from; } public void setFrom(String from) {
	 * this.from = from; } public String getTo() { return to; } public void
	 * setTo(String to) { this.to = to; }
	 * 
	 * public Long getTrainNum() { return trainNum; } public void setTrainNum(Long
	 * trainNum) { this.trainNum = trainNum; }
	 */
	
}

package com.mbc.chew.review;

import java.sql.Date;

public class ReviewDTO {
	
	int tablenum;
	int storecode;
	String id;
	int saramsu;
	String state;
	Date bookingdate;
	Date bookingtime;
	public ReviewDTO() {
	}
	public int getTablenum() {
		return tablenum;
	}
	public void setTablenum(int tablenum) {
		this.tablenum = tablenum;
	}
	public int getStorecode() {
		return storecode;
	}
	public void setStorecode(int storecode) {
		this.storecode = storecode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSaramsu() {
		return saramsu;
	}
	public void setSaramsu(int saramsu) {
		this.saramsu = saramsu;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Date getBookingtime() {
		return bookingtime;
	}
	public void setBookingtime(Date bookingtime) {
		this.bookingtime = bookingtime;
	}
	
}

package com.symbiosis.eventback.model;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eventdetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name,email,eventdesc,location;
	private int guestcount;
	private Date evedate;
	public Eventdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eventdetail(String name, String email, String eventdesc, String location, int guestcount, Date evedate) {
		super();
		this.name = name;
		this.email = email;
		this.eventdesc = eventdesc;
		this.location = location;
		this.guestcount = guestcount;
		this.evedate = evedate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEventdesc() {
		return eventdesc;
	}
	public void setEventdesc(String eventdesc) {
		this.eventdesc = eventdesc;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getGuestcount() {
		return guestcount;
	}
	public void setGuestcount(int guestcount) {
		this.guestcount = guestcount;
	}
	public Date getEvedate() {
		return evedate;
	}
	public void setEvedate(Date evedate) {
		this.evedate = evedate;
	}
	
	
}

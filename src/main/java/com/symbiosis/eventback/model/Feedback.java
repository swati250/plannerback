package com.symbiosis.eventback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	private String name,email,eventattend,rateevent,addcomment;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String name, String email, String eventattend, String rateevent, String addcomment) {
		super();
		this.name = name;
		this.email = email;
		this.eventattend = eventattend;
		this.rateevent = rateevent;
		this.addcomment = addcomment;
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
	public String getEventattend() {
		return eventattend;
	}
	public void setEventattend(String eventattend) {
		this.eventattend = eventattend;
	}
	public String getRateevent() {
		return rateevent;
	}
	public void setRateevent(String rateevent) {
		this.rateevent = rateevent;
	}
	public String getAddcomment() {
		return addcomment;
	}
	public void setAddcomment(String addcomment) {
		this.addcomment = addcomment;
	}
	


}

package com.symbiosis.eventback.service;

import java.util.List;

import com.symbiosis.eventback.model.ContactUs;

public interface ContactUsService {
	ContactUs save(ContactUs r);
	List<ContactUs> getAll();
	ContactUs search(int id);
	void delete(int id);
	ContactUs update(int id,ContactUs c);
}

package com.symbiosis.eventback.service;

import java.util.List;

import com.symbiosis.eventback.model.Eventdetail;

public interface EventDetailService {
	Eventdetail save(Eventdetail r);
	List<Eventdetail> getAll();
	Eventdetail search(int id);
	void delete(int id);
	Eventdetail update(int id,Eventdetail e);
}

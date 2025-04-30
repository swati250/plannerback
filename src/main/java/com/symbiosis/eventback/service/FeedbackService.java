package com.symbiosis.eventback.service;

import java.util.List;

import com.symbiosis.eventback.model.Feedback;

public interface FeedbackService {
	Feedback save(Feedback r);
	List<Feedback> getAll();
	Feedback search(int id);
	void delete(int id);
	Feedback update(int id,Feedback f);

}

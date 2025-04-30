package com.symbiosis.eventback.service;
import java.util.List;

import com.symbiosis.eventback.model.Registration;

public interface RegistrationService {
	Registration save(Registration r);
	List<Registration> getAll();
	Registration search(int id);
	void delete(int id);
	Registration update(int id,Registration r);
	List<Registration> login(String email,String password);
}

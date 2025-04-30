package com.symbiosis.eventback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.eventback.exception.ResourceNotFoundException;
import com.symbiosis.eventback.model.Registration;
import com.symbiosis.eventback.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {
   
	@Autowired
	@Qualifier("regRepo")
	private RegistrationRepository regRepo;

	@Override
	public Registration save(Registration r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<Registration> getAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public Registration search(int id) {
		Registration r=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));

		return r ;
	}

	@Override
	public void delete(int id) {
		Registration r=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		regRepo.deleteById(id);
		}

	@Override
	public Registration update(int id, Registration r) {
		Registration rold=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
         rold.setAddress(r.getAddress());
         rold.setName(r.getName());
         rold.setEmail(r.getEmail());
         rold.setContactno(r.getContactno());
         rold.setPassword(r.getPassword());

		return regRepo.save(rold);

	}

	@Override
	public List<Registration> login(String email, String password) {
		// TODO Auto-generated method stub
		return regRepo.findAllByEmailAndPassword(email, password);

	}

}

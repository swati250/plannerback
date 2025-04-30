package com.symbiosis.eventback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.eventback.exception.ResourceNotFoundException;
import com.symbiosis.eventback.model.ContactUs;
import com.symbiosis.eventback.model.Feedback;
import com.symbiosis.eventback.repository.ContactUsRepository;
@Service

public class ContactUsServiceImpl implements ContactUsService {
	@Autowired
	@Qualifier("conRepo")
	private ContactUsRepository conRepo;



	@Override
	public ContactUs save(ContactUs r) {
		// TODO Auto-generated method stub
		return conRepo.save(r);
	}

	@Override
	public List<ContactUs> getAll() {
		// TODO Auto-generated method stub
		return conRepo.findAll();	}

	@Override
	public ContactUs search(int id) {
		ContactUs f=conRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		return f;
	}

	@Override
	public void delete(int id) {
		ContactUs f=conRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		conRepo.deleteById(id);		
	}

	@Override
	public  ContactUs update(int id, ContactUs c) {
		ContactUs rold=conRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		rold.setEmail(c.getEmail());
		rold.setName(c.getName());
		rold.setMessage(c.getMessage());
		return conRepo.save(rold);
	}

	
}

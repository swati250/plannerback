package com.symbiosis.eventback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.eventback.exception.ResourceNotFoundException;
import com.symbiosis.eventback.model.Eventdetail;
import com.symbiosis.eventback.model.Registration;
import com.symbiosis.eventback.repository.EventDetailRepository;

@Service
public class EventDetailServiceImpl implements EventDetailService{
	@Autowired
	@Qualifier("evRepo")
	private EventDetailRepository evRepo;

	@Override
	public Eventdetail save(Eventdetail r) {
		// TODO Auto-generated method stub
		return evRepo.save(r);
	}

	@Override
	public List<Eventdetail> getAll() {
		// TODO Auto-generated method stub
		return evRepo.findAll();
	}

	@Override
	public Eventdetail search(int id) {
		Eventdetail e=evRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));

		return e;
	}

	@Override
	public void delete(int id) {
		Eventdetail e=evRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		evRepo.deleteById(id);
	}

	@Override
	public Eventdetail update(int id, Eventdetail e) {
		Eventdetail rold=evRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		rold.setName(e.getName());
		rold.setEmail(e.getEmail());
		rold.setEvedate(e.getEvedate());
		rold.setEventdesc(e.getEventdesc());
		rold.setGuestcount(e.getGuestcount());
		rold.setLocation(e.getLocation());
		
		return evRepo.save(rold);
	}

}

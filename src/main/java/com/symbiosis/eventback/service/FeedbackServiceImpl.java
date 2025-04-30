package com.symbiosis.eventback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.eventback.exception.ResourceNotFoundException;
import com.symbiosis.eventback.model.Feedback;
import com.symbiosis.eventback.repository.FeedbackRepository;
import com.symbiosis.eventback.repository.RegistrationRepository;
@Service

public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	@Qualifier("regRepo")
	private FeedbackRepository regRepo;


	@Override
	public Feedback save(Feedback f) {
		// TODO Auto-generated method stub
		return  regRepo.save(f);
	}

	@Override
	public List<Feedback> getAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public Feedback search(int id) {
		 Feedback f=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
			return f;

	}

	@Override
	public void delete(int id) {
		 Feedback f=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		regRepo.deleteById(id);

	}

	@Override
	public Feedback update(int id, Feedback f) {
		 Feedback rold=regRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("resource not found with id"+id));
		 rold.setName(f.getName());
		 rold.setAddcomment(f.getAddcomment());
		 rold.setEmail(f.getEmail());
		 rold.setEventattend(f.getEventattend());
		 rold.setRateevent(f.getRateevent());
		 
		return regRepo.save(rold);
	}

}

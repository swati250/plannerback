package com.symbiosis.eventback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.eventback.model.Feedback;
import com.symbiosis.eventback.model.Registration;
import com.symbiosis.eventback.service.FeedbackService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FeedbackController {

	
	@Autowired
	FeedbackService fs;
	@GetMapping("/feedback")
	public List<Feedback> getAll()
	{
		return fs.getAll();
	}
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> feedback(@RequestBody Feedback f)
	{
		Feedback rn=fs.save(f);
		return new ResponseEntity<>(rn, HttpStatus.CREATED);
	}
	@GetMapping("/feedback/{id}")
	public ResponseEntity<Feedback> search(@PathVariable("id")int i)
	{
		Feedback rn=fs.search(i);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}
	@DeleteMapping("/feedback/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int i)
	{
		fs.delete(i);
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	}
	@PutMapping("/feedback/{id}")
	public ResponseEntity<Feedback> update(@PathVariable("id")int i,@RequestBody Feedback r)
	{
		Feedback rn=fs.update(i,r);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}

}

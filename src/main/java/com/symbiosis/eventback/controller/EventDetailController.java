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

import com.symbiosis.eventback.model.Eventdetail;
import com.symbiosis.eventback.service.EventDetailService;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventDetailController {
	@Autowired
	EventDetailService es;
	@GetMapping("/eventdetail")
	public List<Eventdetail> getAll()
	{
		return es.getAll();
	}
	@PostMapping("/eventdetail")
	public ResponseEntity<Eventdetail> eventdetail(@RequestBody Eventdetail e)
	{
		Eventdetail rn=es.save(e);
		return new ResponseEntity<>(rn, HttpStatus.CREATED);
	}
	@GetMapping("/eventdetail/{id}")
	public ResponseEntity<Eventdetail> search(@PathVariable("id")int i)
	{
		Eventdetail rn=es.search(i);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}
	@DeleteMapping("/eventdetail/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int i)
	{
		es.delete(i);
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	}
	@PutMapping("/eventdetail/{id}")
	public ResponseEntity<Eventdetail> update(@PathVariable("id")int i,@RequestBody Eventdetail r)
	{
		Eventdetail rn=es.update(i,r);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}

}

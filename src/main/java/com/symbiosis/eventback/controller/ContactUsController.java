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

import com.symbiosis.eventback.model.ContactUs;

import com.symbiosis.eventback.service.ContactUsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactUsController {
	@Autowired
	ContactUsService cs;
	@GetMapping("/ContactUs")
	public List<ContactUs> getAll()
	{
		return cs.getAll();
	}
	@PostMapping("/ContactUs")
	public ResponseEntity<ContactUs> contactus(@RequestBody ContactUs f)
	{
		ContactUs rn=cs.save(f);
		return new ResponseEntity<>(rn, HttpStatus.CREATED);
	}
	@GetMapping("/ContactUs/{id}")
	public ResponseEntity<ContactUs> search(@PathVariable("id")int i)
	{
		ContactUs rn=cs.search(i);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}
	@DeleteMapping("/ContactUs/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int i)
	{
		cs.delete(i);
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	}
	@PutMapping("/ContactUs/{id}")
	public ResponseEntity<ContactUs> update(@PathVariable("id")int i,@RequestBody ContactUs r)
	{
		ContactUs rn=cs.update(i,r);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}


}

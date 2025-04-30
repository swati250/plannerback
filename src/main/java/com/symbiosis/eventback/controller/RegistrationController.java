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
import com.symbiosis.eventback.model.Registration;
import com.symbiosis.eventback.service.RegistrationService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
	
	@Autowired
	RegistrationService rs;

	@GetMapping("/registration")
	public List<Registration> getAll()
	{
		return rs.getAll();
	}
	@PostMapping("/registration")
	public ResponseEntity<Registration> register(@RequestBody Registration r)
	{
		Registration rn=rs.save(r);
		return new ResponseEntity<>(rn, HttpStatus.CREATED);
	}
	@GetMapping("/registration/{id}")
	public ResponseEntity<Registration> search(@PathVariable("id")int i)
	{
		Registration rn=rs.search(i);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}
	@DeleteMapping("/registration/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int i)
	{
		rs.delete(i);
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	}
	@PutMapping("/registration/{id}")
	public ResponseEntity<Registration> update(@PathVariable("id")int i,@RequestBody Registration r)
	{
		Registration rn=rs.update(i,r);
		return new ResponseEntity<>(rn, HttpStatus.OK);
	}
	@GetMapping("/registration/{em}/{ps}")
	public List<Registration> login(@PathVariable("em")String em,@PathVariable("ps")String ps)
	{
		List<Registration> rn=rs.login(em,ps);
		return rn;
	
	}

	

}

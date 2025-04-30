package com.symbiosis.eventback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.eventback.model.Admin;

import com.symbiosis.eventback.service.AdminService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService as;
	@PostMapping("/admin")
	public ResponseEntity<Admin> admin(@RequestBody Admin a)
	{
		Admin rn=as.save(a);
		return new ResponseEntity<Admin>(rn, HttpStatus.CREATED);
	}
	@GetMapping("/admin/{email}/{password}")
	public ResponseEntity<Admin> login(@PathVariable("email")String em,@PathVariable("password")String password)
	{
		Admin rn=as.login(em, password);
		return new ResponseEntity<Admin>(rn, HttpStatus.CREATED);
	}
}

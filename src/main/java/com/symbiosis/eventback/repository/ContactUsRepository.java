package com.symbiosis.eventback.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.eventback.model.ContactUs;



@Repository
@Qualifier("conRepo")
public interface ContactUsRepository extends JpaRepository<ContactUs, Integer>{

	
}

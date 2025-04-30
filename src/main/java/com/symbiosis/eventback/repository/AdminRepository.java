package com.symbiosis.eventback.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.eventback.model.Admin;



@Repository
@Qualifier("admRepo")

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findAllByEmailAndPassword(String email,String password);
}

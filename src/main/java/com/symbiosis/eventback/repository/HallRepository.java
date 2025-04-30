package com.symbiosis.eventback.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.eventback.model.Hall;

@Repository
@Qualifier("canRepo")
public interface HallRepository extends  JpaRepository<Hall, Long>{
	 List<Hall> findByLocation(String location);
}

package com.symbiosis.eventback.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.eventback.model.Eventdetail;

@Repository
@Qualifier("evRepo")

public interface EventDetailRepository extends JpaRepository<Eventdetail, Integer>{

}

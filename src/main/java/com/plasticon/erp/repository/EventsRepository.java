package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Events;

@Repository
public interface EventsRepository extends JpaRepository<Events,Number> {

}

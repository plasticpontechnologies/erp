package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plasticon.erp.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Number> {

}
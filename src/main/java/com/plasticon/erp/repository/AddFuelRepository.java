package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AddFuel;

@Repository
public interface AddFuelRepository extends JpaRepository<AddFuel,Integer>{

}

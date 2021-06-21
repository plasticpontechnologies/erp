package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AddVehicle;

@Repository
public interface AddVehicleRepository extends JpaRepository<AddVehicle,Integer>{

}

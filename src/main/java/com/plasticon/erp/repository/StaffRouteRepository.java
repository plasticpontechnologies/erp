package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffRoute;
@Repository
public interface StaffRouteRepository extends JpaRepository<StaffRoute,Integer>{

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.RouteDetails;
@Repository
public interface RouteDetailsRepository extends JpaRepository<RouteDetails,Number> {

}

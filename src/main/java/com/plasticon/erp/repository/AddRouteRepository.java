package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AddRoute;

@Repository
public interface AddRouteRepository extends JpaRepository<AddRoute,Integer> {
}

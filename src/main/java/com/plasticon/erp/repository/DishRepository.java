package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.DishDetails;
@Repository
public interface DishRepository extends JpaRepository<DishDetails,Number> {

	

}

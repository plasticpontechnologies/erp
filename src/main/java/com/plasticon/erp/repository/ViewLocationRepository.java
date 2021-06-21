package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewLocation;
@Repository
public interface ViewLocationRepository extends JpaRepository<ViewLocation,Number> {

}

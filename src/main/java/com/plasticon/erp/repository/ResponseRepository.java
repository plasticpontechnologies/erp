package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Response;
@Repository
public interface ResponseRepository extends JpaRepository<Response,Number> {

}

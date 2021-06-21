package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.GenerateCertificate;

@Repository
public interface GenerateCertificateRepository extends JpaRepository<GenerateCertificate, Number> {
	

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MobileVerifivation;

@Repository
public interface MobileVerifivationRepository extends JpaRepository<MobileVerifivation, Number> {

}

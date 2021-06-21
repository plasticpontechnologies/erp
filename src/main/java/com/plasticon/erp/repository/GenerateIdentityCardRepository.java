package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.GenerateIdentityCard;

@Repository
public interface GenerateIdentityCardRepository extends JpaRepository<GenerateIdentityCard, Number> {

}

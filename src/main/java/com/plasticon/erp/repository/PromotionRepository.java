package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Number>{

}

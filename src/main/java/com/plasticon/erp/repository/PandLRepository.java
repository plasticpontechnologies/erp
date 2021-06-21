package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.PandL;
@Repository
public interface PandLRepository extends JpaRepository<PandL,Integer>{

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Gender;
@Repository
public interface GenderRepository extends JpaRepository<Gender, Number>{

}

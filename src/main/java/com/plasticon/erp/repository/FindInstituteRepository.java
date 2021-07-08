package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.plasticon.erp.model.FindInstitutes;

@Repository
public interface FindInstituteRepository extends JpaRepository<FindInstitutes,Number>{

}

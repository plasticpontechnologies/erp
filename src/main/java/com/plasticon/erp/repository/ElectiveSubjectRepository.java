package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ElectiveSubject;


@Repository
public interface ElectiveSubjectRepository extends JpaRepository<ElectiveSubject,Integer> {

}

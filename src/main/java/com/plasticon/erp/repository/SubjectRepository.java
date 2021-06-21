package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SubjectDetails;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectDetails,Number> {

}

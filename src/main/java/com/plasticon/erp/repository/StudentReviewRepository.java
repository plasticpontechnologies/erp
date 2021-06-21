package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentReview;

@Repository
public interface StudentReviewRepository extends JpaRepository<StudentReview, Number>{

}

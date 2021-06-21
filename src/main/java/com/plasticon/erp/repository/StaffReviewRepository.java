package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SchoolDepartmentDetails;
import com.plasticon.erp.model.StaffReviewDetails;

@Repository
public interface StaffReviewRepository extends JpaRepository<StaffReviewDetails,Number>{

}

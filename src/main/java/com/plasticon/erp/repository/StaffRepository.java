package com.plasticon.erp.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffDetails;
@Repository
public interface StaffRepository extends JpaRepository<StaffDetails,Number> {
	
	@Query("Select s FROM StaffDetails s")
	 List<StaffDetails> getStaffNameAndUserNameAndPassword();
}

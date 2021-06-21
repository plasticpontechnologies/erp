package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AddComplaint;
@Repository
public interface AddComplaintRepository extends JpaRepository<AddComplaint,Integer>{

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Binding;

@Repository
public interface BindingRepository extends JpaRepository<Binding,Integer>{
	

}

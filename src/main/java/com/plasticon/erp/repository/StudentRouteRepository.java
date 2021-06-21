package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentRoute;
@Repository
public interface StudentRouteRepository extends JpaRepository<StudentRoute,Integer>{

}

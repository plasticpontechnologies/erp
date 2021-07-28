package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ClassWiseImages;
@Repository
public interface ClassWiseImagesRepository extends JpaRepository<ClassWiseImages,Integer>{

}

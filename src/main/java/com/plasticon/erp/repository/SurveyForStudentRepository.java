package com.plasticon.erp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plasticon.erp.model.SurveyForStudent;

@Repository
public interface SurveyForStudentRepository extends JpaRepository<SurveyForStudent,Number> {

}

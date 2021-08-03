package com.plasticon.erp.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.plasticon.erp.model.SubjectDetails;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectDetails,Number> {
	
	
	 @Query("SELECT s FROM SubjectDetails s WHERE s.clas.clId = :clsId")
	 List<SubjectDetails> findByClas(int clsId);
	

}

package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MessSchedule;
@Repository
public interface MessRepository extends JpaRepository<MessSchedule, Integer> { 

	  @Query("SELECT t FROM MessSchedule t where t.day.dayId = :dId and t.mealtype.canteenId = :cId") 
	    List<MessSchedule> findDishesById(@Param("dId") int dId,@Param("cId") int cId);
}

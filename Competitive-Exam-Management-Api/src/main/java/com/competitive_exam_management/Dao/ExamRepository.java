package com.competitive_exam_management.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.competitive_exam_management.Entity.ExamEntity;

import jakarta.transaction.Transactional;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Integer>{

	    @Modifying
	    @Transactional
	    @Query("UPDATE ExamEntity e SET e.status = 'Inactive' WHERE e.id = :id")
	    int softDelete(@Param("id") int id);
	    
	    @Query("SELECT s FROM ExamEntity s WHERE s.status = 'Active'")
		List<ExamEntity> findAllActiveStatus();

	    @Query("SELECT s FROM ExamEntity s WHERE s.status = 'Inactive'")
		List<ExamEntity> findAllInactiveStatus();

}

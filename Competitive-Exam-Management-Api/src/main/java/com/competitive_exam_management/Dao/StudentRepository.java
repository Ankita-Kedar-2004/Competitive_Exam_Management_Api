package com.competitive_exam_management.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.competitive_exam_management.Entity.StudentEntity;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	  
	
	  @Modifying
	  
	  @Transactional
	  
	  @Query("UPDATE StudentEntity s SET s.status = 'Inactive' WHERE s.id = :id")
	 int softDelete(@Param("id") int id);
	 
	 @Query("SELECT s FROM StudentEntity s WHERE s.status = 'Active'")
	 List<StudentEntity> findAllActiveStatus();
	 
	 @Query("SELECT s FROM StudentEntity s WHERE s.status = 'Inactive'")
	  List<StudentEntity> findAllInactiveStatus();

	 @Query("SELECT s FROM StudentEntity s WHERE s.email = :userEmail")
	 Optional<StudentEntity> findAllByEmail(String userEmail);
	 
}

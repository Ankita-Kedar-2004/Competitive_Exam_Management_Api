package com.competitive_exam_management.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.competitive_exam_management.Entity.ResultEntity;


public interface ResultRepository extends JpaRepository<ResultEntity, Integer>{
	
	
	@Query("SELECT r FROM ResultEntity r WHERE r.studentId = :id")
	List<ResultEntity> findResultById(@Param("id") int id);

}
